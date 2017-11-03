import java.util.ArrayList;
import java.util.Scanner;

public class TheCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<Car>();
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering?");
		int totalCars = scnr.nextInt();
		
		for (int i = 0; i < totalCars; i++) {
			scnr.nextLine();
			cars.add(new Car());
			System.out.println("Enter Car #" + (i + 1) + " Make");
			cars.get(i).setMake(scnr.nextLine());

			System.out.println("Enter Car #" + (i+ 1) + " Model");
			cars.get(i).setModel(scnr.nextLine());

			System.out.println("Enter Car #" + (i + 1) + " Year");
			cars.get(i).setYear(scnr.nextInt());

			System.out.println("Enter Car #" + (i + 1) + " Price");
			cars.get(i).setPrice(scnr.nextDouble());
			
		}
		System.out.println("Current Inventory:");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		scnr.close();
	}

}
