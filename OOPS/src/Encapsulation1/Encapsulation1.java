package Encapsulation1;

public class Encapsulation1 {
    public static void main(String[] args) {
        // Create a Student object
        Student1 student = new Student1();

        // Set attributes using setter methods
        student.setName("John");
        student.setAge(20);

        // Access attributes using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}