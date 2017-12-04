public class MoreVariableAndPrinting 
{
	public static void main(String[] args)
	{
		//String myName, myEyes, myTeeth, and myHair are defining certain values as a string.
		String myName, myEyes, myTeeth, myHair;
		double myAge, myHeight, myWeight;
		
		myName="Zed A. Shaw";
		myAge=35;
		myHeight=167.64;
		myWeight=58.0598;
		myEyes="Blue";
		myTeeth="White";
		myHair="Brown";
		
		System.out.println("Let's talk about " +myName+".");
		System.out.println("He's " +myHeight+" centimeters tall.");
		System.out.println("He's " +myWeight+" kilograms heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He;s got " +myEyes+" eyes and "+myHair+"hair.");
		System.out.println("His teeth are usually " +myTeeth+" depending on the coffee.");
		System.out.println("If I add "+ myAge+", "+myHeight+", and"+myWeight+" I get "+(myAge+myHeight+myWeight)+".");
	}
}
