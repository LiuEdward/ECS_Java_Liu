import java.util.Scanner;
public class TwoQuestions 
{
	public static void main(String[] args)
	{
		String x, y, z, x1, y1, z1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object and I'll try ang gueswhat it is!");
		System.out.println("Question 1) is it an animal, vegatable, or mineral");
		x = keyboard.next();
		if (x=="animal")
		{
			System.out.println("Question 2) is it bigger than a breadbox");
		}
			x1 = keyboard.next();
			
				if (x1=="no")
				{
					System.out.println("Is it a squireel");
				}
				else
				{
					System.out.println("is it a lion");
			}
			if (x=="vegatable")
			{
				System.out.println("Question 2) is it bigger than a breadbox");
				x1 = keyboard.next();
				
					if (x1=="no")
					{
						System.out.println("Is it a carrot");
					}
					else
						System.out.println("is it a beet");
				}
				if (x=="mineral")
				{
					System.out.println("Question 2) is it red");
					x1 = keyboard.next();
					{
						if (x1=="no")
						{
							System.out.println("Is it a diamond");
						}
						else
							System.out.println("is it a ruby");
					}
					
		}
	}
}

