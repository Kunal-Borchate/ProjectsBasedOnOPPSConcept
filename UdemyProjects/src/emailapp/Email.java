package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int mailBoxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="company.com";
	
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	    this.department=setDepartment();
	    System.out.println("Department:"+this.department);
	    this.password=randomPassword(defaultPasswordLength);
	    System.out.println("Password:"+this.password);
	    email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	    System.out.println("Email:"+email);
	}
	
	private String setDepartment() {
		System.out.print("Department Codes \n1 Sales \n2 Development"
				+ "\n3 Accounting \n4 None \n Enter Department Codes:");
		Scanner sc=new Scanner(System.in);
	    int depChoice=sc.nextInt();
	    if(depChoice==1) {
	    	return "Sales";
	    }
	    else if(depChoice==2) {
	    	return "Development";
	    }
	    else if(depChoice==3) {
	    	return "Development";
	    }
	    else {
	    	return "";
	    }
	}
	
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTWXYZ0123456789!@#$%";
		char[]password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Name:"+firstName+" "+lastName+"\n"+
				"CompanyEmail:"+email+"\n"+
				"MailboxCapacity:"+mailBoxCapacity;
				
	}
	
}
