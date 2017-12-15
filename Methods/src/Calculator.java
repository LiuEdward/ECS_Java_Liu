import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Give me a math procedure: ");
		String num1 = keyboard.next();
		String opp = keyboard.next();
		String num2 = keyboard.next();
		if (opp == "+")
		{
			add(num1,num2);
		}
		else if (opp == "-")
		{
			sub(num1,num2);
		}
		else if (opp == "*")
		{
			mult(num1,num2);
		}
		else if (opp == "/")
		{
			div(num1,num2);
		}
		else
		{
			exp(num1,num2);
		}
	}
	public static double add(int x, int y)
	{
		double z=x+y;
		return z;
	}
	public static double sub(int x, int y)
	{
		double z=x-y;
		return z;
	}
	public static double mult(int x, int y)
	{
		double z=x*y;
		return z;
	}
	public static double div(int x, int y)
	{
		double z=x/y;
		return z;
	}
	public static double exp(int x, int y)
	{
		while(y>0)
		{
			x=x*x;
			y=y-1;
		}
		double z=x;
		return z;
	}
}
