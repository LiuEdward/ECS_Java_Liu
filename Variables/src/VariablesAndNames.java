public class VariablesAndNames 
{
	public static void main(String[] args)
	{
		// the variables 'cars' is the amount of cars availabe, 'passengers' is the amount of passengers, 'cars not driven' is the amount of cars without a driver, 'cars driven' are the amount of cars with a driver, 'space in a car' is the defined space a car has, 'carpool capacity' is the amount of people carpooling, 'average passengers per car' is the average amount of people  in a car.
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		
		cars=100;
		//4.0 and double unessacary, all are whole numbers.
		space_in_a_car=4.0;
		drivers=30;
		passengers=90;
		cars_not_driven=cars-drivers;
		cars_driven=drivers;
		carpool_capacity=cars_driven*space_in_a_car;
		average_passengers_per_car=passengers/cars_driven;
		
		System.out.println("There are "+ cars +" cars available.");
		System.out.println("There are only "+ drivers +" drivers available.");
		System.out.println("There will be "+ cars_not_driven +" empty cars today.");
		System.out.println("We can transport "+ carpool_capacity +" people today.");
		System.out.println("We have "+ passengers +" to carpool today.");
		System.out.println("We need to put about "+ average_passengers_per_car +" in each car.");
	}
}
