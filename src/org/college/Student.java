package org.college;
//Multilevel inheritance
public class Student extends Hostel {
	//child class 
	public void studentName() {
		System.out.println("Kanishkar");
		
	}
    public void studentDept() {
		System.out.println("Mechanical");
	}
    public void studentId() {
		System.out.println("98765");

	}
    public static void main(String[] args) {
		Student a = new Student();
		a.studentName();
		a.studentDept();
		a.studentId();
		a.deptName();
		a.hostelName();
		a.collegeCode();
		a.collegeName();
		a.collegeRank();
		
	}
}
