package com.springBoot.REST_advanced.model;


public class Student 
{
	String name;
	Course course;
	MailingAddress address;
	public Student() {}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) 
	{
		this.course = course;
	}
	public MailingAddress getAddress() 
	{
		return address;
	}
	public void setAddress(MailingAddress address) 
	{
		this.address = address;
	}
	public Student(String name, Course course, MailingAddress mailAd)
	{
		this.name=name;
		this.course=course;
		this.address=mailAd;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}
