package assignment3_3; // Declaring the package Compulsory.
/*
 * Program to describe the Constructor chaining using This Keyword.
 */

public class Assignment3_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Employee();// Calling the Constructor.
	}

}
class Employee{	
Employee() // Creating the constructor with no parameter.
{
this(33); // Using This keyword for calling constructor.
System.out.println("The Default Constructor");
}
Employee(int rollno) // Creating the parameterized constructor with one variable.
{
this(40, "Anirudh");
System.out.println("Employee no"+ rollno);
}
Employee(int rollno, String name) // Creating parameterized constructor with two variables.
{
System.out.println("Employee no "+rollno + " Employee Name " +name);
}
}