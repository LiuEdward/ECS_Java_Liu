import java.util.Scanner;
public class CollatzSequence 
{
	public static void main(String[] args)
	{
		int a,b,c;
		b=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Let's create a COLLAT SEQUENCE!");
		System.out.println("Rules: ");
		System.out.println("If the number is even, divide it by two.");
		System.out.println("If the number is odd, multiply three and add one.");
		System.out.println("Repeat this decision until you reach 1");
		System.out.println("Starting Number: ");
		a = keyboard.nextInt();
		c=a;
		System.out.println(a);
		while (a > 1)
		{
			if ((a%2)==0)
			{
				a=a/2;
				System.out.println(a);
				b++;
			}
			else
			{
				a=a*3+1;
				System.out.println(a);
				b++;
				if (c<a)
				{
					c=a;
				}
			}
			
		}
		System.out.println("Terminated after "+b+" steps");
		System.out.println("The largest value is "+c);
		
		
		
		
		
		
		
		
		
	}
}
