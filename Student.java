// Question 1: Object-Oriented Programming Concepts in Java

// Part a) Encapsulation

public class Student {
    // Private attributes (encapsulation)
    private String name;
    private int grade;
    
    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade); // Using setter to validate input
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for grade
    public int getGrade() {
        return grade;
    }
    
    // Setter for grade with validation
    public void setGrade(int grade) {
        // Ensuring grade is within 0 to 100
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0; // Set to 0 if outside valid range
        }
    }
    
    // Test method
    public static void main(String[] args) {
        Student student1 = new Student("John", 85);
        System.out.println("Name: " + student1.getName());
        System.out.println("Grade: " + student1.getGrade());
        
        student1.setGrade(150); // Invalid grade
        System.out.println("Grade after invalid input: " + student1.getGrade());
    }
}
