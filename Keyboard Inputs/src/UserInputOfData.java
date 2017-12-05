import java.util.Scanner;

public class UserInputOfData 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String fname, lname, login;
		int grade, id;
		double gpa;
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		
		System.out.println("First name:");
		fname = keyboard.next();
		
		System.out.println("Last name:");
		lname = keyboard.next();
		
		System.out.println("Grade (9-12):");
		grade = keyboard.nextInt();
		
		System.out.println("Student ID:");
		id = keyboard.nextInt();
		
		System.out.println("Login:");
		login = keyboard.next();
		
		System.out.println("GPA (0.0-4.0):");
		gpa = keyboard.nextDouble();
		
		System.out.println("Your information:");
		System.out.println("	Login: " + login);
		System.out.println("	ID   : " + id);
		System.out.println("	Name : " + lname+ ", " + fname);
		System.out.println("	GPA  : " + gpa);
		System.out.println("	Grade: " + grade);
	}
}
