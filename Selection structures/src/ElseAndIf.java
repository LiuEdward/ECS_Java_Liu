public class ElseAndIf 
{
	public static void main(String[] args)
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
		if (cars>people)
		{
			System.out.println("We should take the cars.");
		} //without else adds a line we can't decide
		else if (cars<people)
		{
			System.out.println("We should not take the cars.");
		}
		else
		{
			System.out.println("We can't decide.");
		}
		if (buses>cars)
		{
			System.out.println("That's too many buses.");
		}
		else if (buses<cars)
		{
			System.out.println("Maybe we could take the buses.");
		}
		else
		{
			System.out.println("We still can't decide.");
		}
		if (people>buses)
		{
			System.out.println("All right, let's just take the buses.");
		}
		else
		{
			System.out.println("Fine, let's stay home then.");
		}
	}
}
//the difference between if, else, and else if is that if executes a certain command defined by the user if a value is matches the if structure. Else if executes a certain command if a value does not match the if structure but matches the else if structure. Else executes a certain command for every other value.