package Backend;

public class Student implements RecordsInterface {
    private String studentID;
    private String name;
    private int age;
    private String gender;
    private String department;
    private double gpa;

    public Student(String studentID, String name, int age, String gender, String department, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.gpa = gpa;
    }
