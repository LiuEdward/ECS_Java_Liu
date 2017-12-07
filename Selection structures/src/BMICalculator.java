import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double feet, inc, weight, x, y, z, a;
		System.out.println("BMI is a way of representing your size");
		System.out.println("How many feet tall");
		feet = keyboard.nextInt();
		System.out.println("How many inches");
		inc = keyboard.nextInt();
		System.out.println("How many pounds");
		weight = keyboard.nextInt();
		x = (inc/12)+feet;
		y = x* 0.3048;
		z = weight*0.4536;
		a = z/(y*y);
		System.out.println("Your BMI is :"+a);
		if (a<18.5)
		{
			System.out.println("You are underweight");
		}
		else if(a<24.9 && a>18.5)
		{
			System.out.println("You are normal");
		}
		else if(a<29.9 && a>25)
		{
			System.out.println("You are overweight");
		}
		else
		{
			System.out.println("You are obese");
		}
	}

}
