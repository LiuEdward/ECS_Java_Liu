import java.util.Scanner;

public class AddingValuesForLoop 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int x,y;
		y=0;
		System.out.println("Number:");
		x = keyboard.nextInt();
		
		for (int n = 1 ; n <= x ; n = n+1)
		{
			y=y+n;
			System.out.println(n);
		}
		System.out.println("The sum is: "+y);
	}
}