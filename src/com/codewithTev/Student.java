package com.codewithTev;

public class Student {

    String name, department, role;
    int student_no, student_id;


    public Student(String name, int student_id, int student_no){
        this.name = name;
        this.student_id = student_id;
        this.student_no = student_no;
    }


    public void setDepartment(String studentDepartment){
        department = studentDepartment;
    }

    public void setRole(String studentRole) {
        role = studentRole;
    }

    /* Print the Student Details */
    public void studentDetails(){
        System.out.println("Name :" + name);
        System.out.println("Student No :" + student_no);
        System.out.println("Department :" + department);
        System.out.println("Role :" + role);
    }
}