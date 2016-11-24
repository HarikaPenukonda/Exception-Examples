package exceptionExamples;

import java.util.Scanner;

import programs.InvalidAgeException;

public class CustomExceptionTest  {

	int age;
	public void checkAge() throws  InvalidAgeException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :");
		age = sc.nextInt();
		if(age>=18)
		{
		if(age<=25)	
		
		{
			System.out.println("Eligible "+age);
		}
		else
		{
			System.out.println("Not Eligible");
			throw new  InvalidAgeException();
		}
	}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	CustomExceptionTest c1 = new CustomExceptionTest ();
	try
	{
		c1.checkAge();
	}
	catch( InvalidAgeException ex)
	{
		System.out.println("Exception caught "+ex);
	}

	}

}
