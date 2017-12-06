import java.util.Scanner;
public class SpaceBoxing 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int weight, x;
		System.out.println("Please enter your current earth weight:");
		weight = keyboard.nextInt();
		
		System.out.println("I have information for the following planets:");
		System.out.println("1. venus   2. mars   3. jupiter");
		System.out.println("4. saturn  5. uranus 6. neptune");
		System.out.println("Which planet are you visiting?");
		x = keyboard.nextInt();
		if (x==1)
		{
			System.out.println("Your weight would be "+(0.78*weight)+" pounds on that planet.");
		}
		if (x==2)
		{
			System.out.println("Your weight would be "+(0.39*weight)+" pounds on that planet.");
		}
		if (x==3)
		{
			System.out.println("Your weight would be "+(2.65*weight)+" pounds on that planet.");
		}
		if (x==4)
		{
			System.out.println("Your weight would be "+(1.17*weight)+" pounds on that planet.");
		}
		if (x==5)
		{
			System.out.println("Your weight would be "+(1.05*weight)+" pounds on that planet.");
		}
		if (x==6)
		{
			System.out.println("Your weight would be "+(1.23*weight)+" pounds on that planet.");
		}
	}
}
