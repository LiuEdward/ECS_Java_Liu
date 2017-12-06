import java.util.Scanner;

public class ALittleQuiz 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x, y, z;
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("1) Melbourne");
		System.out.println("2) Anchorage");
		System.out.println("3) Juneau");
		x = keyboard.nextInt();
		if (x==3)
		{
			System.out.println("That's right!");
		}
		System.out.println("Q2) Can you store the value cat in a variable of the tyoe int?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		y = keyboard.nextInt();
		if (y==2)
		{
			System.out.println("That's right!");
		}
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("1) 5");
		System.out.println("2) 11");
		System.out.println("3) 15/3");
		z = keyboard.nextInt();
		if (z==2)
		{
			System.out.println("That's correct!");
		}
		
		
	
	}
}
