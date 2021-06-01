package com.codewithTev;

public class StudentInfo {

    // Declarations for the Student Fields
    private int regno;
    private String first_name;
    private String last_name;
    private String role;
    private String department;

    public int getRegno() {
        return regno;
    }

   public void setRegno(int regno) {
        this.regno = regno;
   }

   public String getFirst_name(){
        return first_name;
   }

   public void setFirst_name(String first_name){
        this.first_name = first_name;
   }

   public String getLast_name() {
        return last_name;
   }

   public void setLast_name(String last_name){
        this.last_name = last_name;
   }

   public String getRole() {
        return role;
   }

   public void setRole(String role) {
        this.role = role;
   }

   public String getDepartment() {
        return department;
   }

   public void setDepartment(String department) {
        this.department = department;
   }
}
