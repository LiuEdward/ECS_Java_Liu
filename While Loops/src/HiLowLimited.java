import java.util.Scanner;
import java.util.Random;
public class HiLowLimited 
{
	public static void main ( String[] args )
	{
		int y=0;
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
		while (num>rnum && y<7)
		{
			System.out.println("Sorry, you are too high.");
			num = keyboard.nextInt();
			y++;
		}
		while (num<rnum && y<7)
		{
			System.out.println("Sorry, you are too low.");
			num = keyboard.nextInt();
			y++;
		}
		if (y == 7)
		{
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		}
	}
}
