import java.util.Scanner;
import java.util.Random;
public class HiLow 
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int num;
		int rnum = 1 + r.nextInt(100);
		System.out.println("I'm thinking of a number between 1 and 100! Try to guess it.");
		num = keyboard.nextInt();
		if (num == rnum)
		{
			System.out.println("You guessed it! What are the odds!");
		}
		else if (num>rnum)
		{
			System.out.println("Sorry, you are too high. I was thinking of "+rnum);
		}
		else if (num<rnum)
		{
			System.out.println("Sorry, you are too low. I was thinking of " +rnum);
		}
	}
}
