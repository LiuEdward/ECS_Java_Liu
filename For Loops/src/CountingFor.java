import java.util.Scanner;

public class CountingFor 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type in a message, and I'll display it five times.");
		System.out.println("Message: ");
		String message = keyboard.nextLine();
		
		for (int n = 2 ; n <= 20 ; n = n+3)
		{
			System.out.println(n+". "+message);
		}
	}
}
