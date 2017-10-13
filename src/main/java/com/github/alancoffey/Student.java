package com.github.alancoffey;

import org.joda.time.DateTime;


public class Student {
	private String name;
	private int age;
	private int id;
	private String username;
	private DateTime dob;
	private CourseProgramme course;
	
	public Student(String name,int age,int id,DateTime dob){
		this.name = name;
		this.age = age;
		this.id = id;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DateTime getDob() {
		return dob;
	}

	public void setDob(DateTime dob) {
		this.dob = dob;
	}
	public String getCourse(){
		return this.course.toString();
	}
    public String getUsername() {
        String username = this.name + this.age;
        return username.toLowerCase();
    }
	public void addStutoCourse(CourseProgramme course){
		this.course = course;
	}

    public void setUsername(String username) {
        this.username = username;
    }
	@Override
	public String toString() {
		return "Student [course=" + course + ", getCourse()=" + getCourse()
				+ "]";
	}
    
		
}

