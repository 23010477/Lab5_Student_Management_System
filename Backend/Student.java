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
    	ArrayList<Student> students = Admin.listOfStudents;
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
		 if (name == null || name.trim().isEmpty()) {
	            JOptionPane.showMessageDialog(null, "Name cannot be empty!", "Input Error", JOptionPane.ERROR_MESSAGE);
	        } else {
	            this.name = name.trim();
	        }
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<=0||age>100) {
            JOptionPane.showMessageDialog(null, "Please enter a valid age ", "Input Error", JOptionPane.ERROR_MESSAGE);

		}
		else {
		this.age = age;
		
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(!(gender==null||gender.trim().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Gender cannot be empty", "Input Error", JOptionPane.ERROR_MESSAGE);
		}
		else if(gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")) {
            JOptionPane.showMessageDialog(null, "Gender must be 'Male' or 'Female'", "Input Error", JOptionPane.ERROR_MESSAGE);

		}
		else {
		this.gender = gender;
		}
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		if(department==null||department.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Department cannot be empty", "Input Error", JOptionPane.ERROR_MESSAGE);
		}
		else {
		this.department = department;
		}
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if(gpa<0.0||gpa>4.0) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Gpa", "Input Error", JOptionPane.ERROR_MESSAGE);

		}
		else {
		this.gpa = gpa;
		}
	}
	
public String toString() {
    return "ID: " + studentID +
           ", Name: " + name +", Age: " + age +", Gender: " + gender +", Department: " + department +", GPA: " + gpa;
}
    
}
    
