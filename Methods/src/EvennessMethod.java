public class EvennessMethod 
{
	public static void main(String[] args)
	{
		for(int x=1; x<=100; x=x+1)
		{
			System.out.println(x);
			if((x%2)==0)
			{
				System.out.println(isEven());
			}
			if((x%3)==0)
			{
				System.out.println(isDivBy3());
			}
		}
	}
	public static String isEven()
	{
		String even;
		even="<";
		return even;
	}
	public static String isDivBy3()
	{
		String div3;
		div3="=";
		return div3;
	}
}
