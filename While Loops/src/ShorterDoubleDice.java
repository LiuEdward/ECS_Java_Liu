import java.util.Random;

public class ShorterDoubleDice 
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		int rnum = 1 + r.nextInt(6);
		int rnum1= 1 + r.nextInt(6);
		
		System.out.println("HERE COMES THE DICE!");
		System.out.println("Roll #1: "+rnum);
		System.out.println("Roll #2: "+rnum1);
		System.out.println("The total is  "+(rnum+rnum1+"!"));
		do 
		{
			rnum = 1 + r.nextInt(6);
			rnum1= 1 + r.nextInt(6);
			System.out.println("HERE COMES THE DICE!");
			System.out.println("Roll #1: "+rnum);
			System.out.println("Roll #2: "+rnum1);
			System.out.println("The total is  "+(rnum+rnum1+"!"));
		} while ( rnum != rnum1);
		
		
	}
}
