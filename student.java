package org.Student;

import org.Department.Department;

public class student extends Department {
public void studentName() {
	System.out.println("raja");
}
public void studentId() {
System.out.println("80005");	
}
public void studentDepartment () {
	System.out.println("electrical and electronic engineering");
	}
public static void main(String[] args) {
	student s1=new student();
	s1.collegeName();
	s1.collegeRank();
	s1.collegeCode();
	s1.departmentName();
	s1.studentName();
    s1.studentId();
    s1.studentDepartment();
}
}
