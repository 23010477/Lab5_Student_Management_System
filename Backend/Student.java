package Backend;

import java.awt.Component;
import java.sql.Array;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Student implements RecordsInterface {
    private int studentID;
    private String name;
    private int age;
    private String gender;
    private String department;
    private double gpa;

    public Student(int studentID, String name, int age, String gender, String department, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.gpa = gpa;
    }
    private boolean isIDUsed(int id) {
    	ArrayList<Student> students = Admin.getListOfStudents()
		for(int i=0 ; i<students.size();i++) {
			Student s = students.get(i);
			if(s.getStudentID() == id) {
				return true;
			}
			
    	}
		return false;
    }
    
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		if(studentID<=0 ) {
			JOptionPane.showMessageDialog(null, "Student ID cannot be empty", "Input Error", JOptionPane.ERROR_MESSAGE);
		}
		else if (isIDUsed(studentID)) {
            JOptionPane.showMessageDialog(null, "This Student ID already exists! Please choose another one.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } 
		else {
			this.studentID = studentID;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
    
    
}