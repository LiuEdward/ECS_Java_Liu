import java.util.Scanner;
public class TwoQuestions 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x, y, z, x1, y1, z1;
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object and I'll try and gueswhat it is!");
		System.out.println("Question 1) is it a (1) animal, (2) vegatable, or (3) mineral");
		x = keyboard.nextInt();
		if (x==1)
		{
			System.out.println("is it bigger than a breadbox?");
			System.out.println("1). yes");
			System.out.println("2). no");
			x1 = keyboard.nextInt();
			if(x1==1)
			{
				System.out.println("Is it a squirel");
			}
			else
			{
				System.out.println("Is it a lion");
			}
		}
		if (x==2)
		{
			System.out.println("is it pointy?");
			System.out.println("1). yes");
			System.out.println("2). no");
			x1 = keyboard.nextInt();
			if(x1==1)
			{
				System.out.println("Is it a carrot");
			}
			else
			{
				System.out.println("Is it an eggplant");
			}
		}
		if (x==3)
		{
			System.out.println("is it red?");
			System.out.println("1). yes");
			System.out.println("2). no");
			x1 = keyboard.nextInt();
			if(x1==1)
			{
				System.out.println("Is it a ruby");
			}
			else
			{
				System.out.println("Is it a diamond");
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}