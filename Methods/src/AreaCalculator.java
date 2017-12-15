import java.util.Scanner;
public class AreaCalculator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int a,x,y;
		System.out.println("1. Triangle");
		System.out.println("2. Rectangle");
		System.out.println("3. Square");
		System.out.println("4. Circle");
		a = keyboard.nextInt();
		if (a==1)
		{
			System.out.println("What is the base");
			x = keyboard.nextInt();
			System.out.println("What is the height");
			y = keyboard.nextInt();
			System.out.println(tri(x,y));
		}
		else if(a==2)
		{
			System.out.println("What is the length");
			x = keyboard.nextInt();
			System.out.println("What is the width");
			y = keyboard.nextInt();
			System.out.println(rect(x,y));
		}
		else if(a==3)
		{
			System.out.println("What is the side");
			x = keyboard.nextInt();
			System.out.println(squ(x));
		}
		else
		{
			System.out.println("What is the radius");
			x = keyboard.nextInt();
			System.out.println(circ(x));
		}
	}
	public static double tri(int base, int height)
	{
		double tria=0.5*base*height;
		return tria;
	}
	public static double rect(int length, int width)
	{
		double recta=length*width;
		return recta;
	}
	public static double squ(int side)
	{
		double squa=side*side;
		return squa;
	}
	public static double circ(int radius)
	{
		double circa=3.14*radius*radius;
		return circa;
	}
}
