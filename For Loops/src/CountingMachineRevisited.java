import java.util.Scanner;
public class CountingMachineRevisited 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x, y, z;
		System.out.println("Count from:");
		x = keyboard.nextInt();
		System.out.println("Count to:");
		y = keyboard.nextInt();
		System.out.println("Count by:");
		z = keyboard.nextInt();
		for (int n = x ; n <= y ; n = n+z)
		{
			System.out.println(n);
		}
		
		
		
		
		
		
		
		
	}
}
