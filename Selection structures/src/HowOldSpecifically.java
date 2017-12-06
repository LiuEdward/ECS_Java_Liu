import java.util.Scanner;
public class HowOldSpecifically 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		System.out.println("Hey, What is your name?");
		name = keyboard.next();
		System.out.println("Ok " + name + ", how old are you?");
		age = keyboard.nextInt();
		if (age>=25)
		{
			System.out.println("You can pretty much do whatever you want.");
		}
		else if (age<=24 && age>=18)
		{
			System.out.println("You can vote but not rent a car.");
		}
		else if (age<=17 && age>=16)
		{
			System.out.println("You can drive but not vote.");
		}
		else
		{
			System.out.println("You cannot drive");
		}
	}
}
