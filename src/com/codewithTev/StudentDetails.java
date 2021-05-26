package com.codewithTev;

public class StudentDetails {

    public static void main(String[] args) {
	// write your code here

        Student  studentOne = new Student ("Tevin MIlla", 33333,
        56);
        Student studentTwo = new Student("Charles Omwa",4444, 45);


        studentOne.setDepartment("IT");
        studentOne.setRole("Intern");
        studentOne.studentDetails();

        studentTwo.setDepartment("IT");
        studentTwo.setRole("Software Developer");
        studentTwo.studentDetails();
    }
}
