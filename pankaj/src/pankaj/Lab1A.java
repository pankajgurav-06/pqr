package pankaj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class Student{
	private String USN;private String Name;private String Branch;private String Phone;public String getUSN() {
		return USN;
		
	}
	public String getName() {return Name;
}
public String getBranch() {
	return Branch;
}
public String getPhone() { 
	return Phone;

}
public Student(String usn,String name,String branch,String phone)
{
	super();
	USN=usn;
	Name=name;Branch=branch;Phone=phone;
}}

public class Lab1A {
	public static void main(String[] args)throws IOException{ BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter USN:-");
	String USN=in.readLine();
	System.out.println("Enter Name:-");
	String Name=in.readLine();
	System.out.println("Enter Branch:-");
	String Branch=in.readLine();
	System.out.println("Enter Phone number:-");
	String Phone=in.readLine();
	Student student=new Student(USN,Name,Branch,Phone);System.out.println("Student Details");
	System.out.println("USN\t\t Name\t\t Branch\tPhone");USN=student.getUSN();
	Name=student.getName();
	Branch=student.getBranch();
	Phone=student.getPhone();
	System.out.println(USN+"\t"+Name+"\t\t"+Branch+"\t"+Phone);
	
	
	
	
	
	
	}

}
