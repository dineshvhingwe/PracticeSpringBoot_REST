package com.springBoot.REST_advanced;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springBoot.REST_advanced.model.Student;

@RestController
@RequestMapping(value="/student")
public class StudentController 
{
	@Autowired
	StudentDAO studentDAO;
		
	@RequestMapping(value="/get/{name}", produces="application/json")
	public ResponseEntity<Student> getStudent(@PathVariable("name") String name)
	{
		Student student=studentDAO.getStudent(name);
		return new ResponseEntity<Student>(student,HttpStatus.OK);

	}

	@RequestMapping(value="/getAll", produces="application/json")
	public ResponseEntity<List<Student>> getStudentList()
	{
		List<Student> studentList=studentDAO.getStudentList();
		return new ResponseEntity<List<Student>>(studentList,HttpStatus.OK);

	}

	@RequestMapping(value="/create", consumes="application/json", method=RequestMethod.POST)
	public ResponseEntity<Void> getStudentList(@RequestBody Student student)
	{
		boolean status=studentDAO.createStudent(student);
		if(status==true)
		{ return new ResponseEntity<Void>(HttpStatus.CREATED);}
		else
		{ return new ResponseEntity<Void>(HttpStatus.UNPROCESSABLE_ENTITY);}

	}
	
}
