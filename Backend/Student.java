package Backend;

public class Student {
    private String Name,department,gender,studentID;
    private int age;
    private double gpa;


public void AddStudent(String Name, int age,String studentID, String gender, String department, double gpa) {
	
}

public Student[] GetListOfStudent() {
	Student[] students = new Student[arraysize];
	
	return students;
}

public Student SearchStudent(String studentID) {
	Student student = null;
	return student;
}
public boolean UpdateStudent(String studentID, String name, int age, String gender, String department, double gpa) {
	return true;
}

public boolean DeleteStudent(String studentID) {
	return true;

}
}
