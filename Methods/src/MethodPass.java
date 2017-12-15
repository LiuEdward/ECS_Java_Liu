import java.util.Scanner;
public class MethodPass 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x;
		String a;
		System.out.println("Pick a number:");
		x = keyboard.nextInt();
		a=div(x);
		if(a=="true")
		{
			System.out.println("I like that number!");
		}
		else
		{
			System.out.println("That number is gross...");
		}
	}
	public static String div(int y)
	{
		String z;
		if ((y%3)==0)
		{
			z="true";
		}
		else
		{
			z="false";
		}
		return z;
	}
}
