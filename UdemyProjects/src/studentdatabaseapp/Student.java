package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String studentId;
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;
	
	public Student() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student first name");
		this.firstName=sc.nextLine();
		System.out.println("Enter student last name");
		this.lastName=sc.nextLine();
		System.out.println("1-Freshmen \n2-Sophomore \n3-Junior \n4-Senior "
				+ "\n Enter Student class level");
		this.gradeYear=sc.nextInt();
		
		setStudentId();
		System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentId);
		
	}
	
	private void setStudentId() {
		id++;
		this.studentId= gradeYear+""+id;
		
	}
	
	public void enroll() {
		do {
			System.out.print("Enter courses to enroll or Q to quit");
			Scanner sc=new Scanner(System.in);
			String course=sc.nextLine();
			if(!course.equals("Q")) {
				courses=courses+"\n  "+course;
				tuitionBalance+=costOfCourse;
			}else {
				break;
			}
		}while(true);
		
		System.out.println("Enrolled in:"+courses);
		System.out.println("Tuition Balance:"+tuitionBalance);
	}
	
	public void viewBalance() {
		System.out.println("Your balance is:"+tuitionBalance);
	}
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment $:");
		Scanner sc=new Scanner(System.in);
		int payment=sc.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	}
	
	public String showInfo() {
		return "Name:"+firstName+" "+lastName+
				"\nGrade Level:"+gradeYear+
				"\nStudent ID:"+studentId+
				"\nCourses Enrolled:"+courses+
				"\nBalance :$"+tuitionBalance; 
	}
}
