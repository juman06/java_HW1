package com.mycompany.java_hw1;

public class Java_HW1 {

    public static void main(String[] args) {
        Student<Number> student = new Student<Number>("Ahmed", 85.5);
    student.display();
    Student.showGrade(student);
    }
}

class Student<T> {
    String name; 
    T grade;
Student(String name, T grade) {
    this.name = name;
    this.grade = grade;}

T getGrade() { return grade;}

void display() {
    System.out.println("Student: " + name);
    System.out.println("Grade: " + grade);     }
       
static void showGrade(Student<? super Number> Student) {
    System.out.println("Registered Grade: " + Student.getGrade());
}}