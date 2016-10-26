import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class LabNumberOne {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		double length, width, area, perimeter, volume = 0.0;
		double height = 12.0; // hardcoded random height for each room;
		String yorn;
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		
		Boolean bool = false;
		
		while (!bool){
			System.out.println("Enter Length:");
			
			length = isDouble(sc);
			
			System.out.println("Enter Width");
			
			width = isDouble(sc);
			
			area = length * width;
			perimeter = 2 * (length + width);
			volume = length * width * height;
			
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			sc.nextLine();
			
			System.out.println("Continue? (y/n)");
			yorn = sc.nextLine(); 
			
			
			if (!yorn.equalsIgnoreCase("Y")) {
					System.out.println("Okay Goodbye!");
					bool = true;
				}
			};
		}

	public static double isDouble(Scanner sc) {
		while (!sc.hasNextDouble()) {
			System.out.println("That's not an double! Please enter a double: ");
			sc.next();
		}
		return sc.nextDouble();
	}
	
}

