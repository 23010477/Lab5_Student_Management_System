package Backend;

public class Student {
    private String Name,department,gender,studentID;
    private int age;
    private double gpa;


public void addstudent(String Name, int age,String studentID, String gender, String department, double gpa) {
	
}

public Student[] getListOfStudent() {
	Student[] students = new Student[arraysize];
	
	return students;
}

public Student Searchstudent(String studentID) {
	Student student = null;
	return student;
}
public boolean updateStudent(String studentID, String name, int age, String gender, String department, double gpa) {
	return true;
}

public boolean deleteStudent(String studentID) {
	return true;

}
}
