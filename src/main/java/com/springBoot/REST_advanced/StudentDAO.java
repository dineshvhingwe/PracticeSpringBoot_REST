package com.springBoot.REST_advanced;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springBoot.REST_advanced.model.Course;
import com.springBoot.REST_advanced.model.MailingAddress;
import com.springBoot.REST_advanced.model.Student;

@Component
public class StudentDAO 
{
	static ArrayList<Student> studentList=new ArrayList<Student>(); 
	
	static {
		Course course1=new Course(123,"Mulesoft");
		Course course2=new Course(234,"SpringBoot");
		Course course3=new Course(345,"Spring4");
		studentList.add(new Student("Dinesh",course1,new MailingAddress(40157, "Undangaon")));
		studentList.add(new Student("Ashish",course2,new MailingAddress(30140, "Sillod")));
		studentList.add(new Student("Malage",course3,new MailingAddress(20130, "Golgaon"))); 	
		
	}

	public StudentDAO(){}

	public Student getStudent(String name)
	{
		System.out.println(name);
		int i=studentList.size()-1;
		while(i>0)
		{
			if(studentList.get(i).getName().equalsIgnoreCase(name))
			{	return studentList.get(i);}
			i--;
		}
		return studentList.get(0);
	}

	public List<Student> getStudentList() 
	{
		return studentList;
	}

	public boolean createStudent(Student student) 
	{
		try {
			studentList.add(student);
			System.out.println("Created succesfully");		
			return true;
		}catch(Exception e){
			System.out.println("Exception occured while adding student");
		return false;
		}
	}

}
