//if println was replaced by print, everything would be on one line.
//allows computer to ask you questions
import java.util.Scanner;
public class AskingQuestions 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //creates a scanner using the keyboard
		String name;
		int age, feet, inches;
		double weight;
	
		
		System.out.println("What is your name?");
		name = keyboard.next();//cant use int, is a string
		
		System.out.println("How old are you");
		age = keyboard.nextInt();
		
		System.out.println("How many feet tall are you?");
		feet = keyboard.nextInt();
		
		System.out.println("How many inches?");
		inches = keyboard.nextInt();
		
		System.out.println("How much do you weigh?");
		weight = keyboard.nextDouble();
		
		System.out.println("So you're name is " + name + ", you are " + age + " years old, you're " + feet + "'" + inches + ", and you weigh " + weight + " pounds.");
		
		keyboard.close();
	}
}
