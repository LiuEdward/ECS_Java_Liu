import java.util.Random;
import java.util.Scanner;
public class KeepGuessing
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(10);
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.println("Your guess:");
		int entry = keyboard.nextInt();
		while (entry != x)
		{
			System.out.println("\nThat is incorrect.");
			System.out.println("Guess again. ");
			entry = keyboard.nextInt();
		}
		System.out.println("\nThat's right! You're a good guesser.");
	}
}
