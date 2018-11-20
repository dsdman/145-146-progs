/*
 * Dylan Desai
 */
package happyHour;
import java.util.Scanner;

public class BeerTest {

	public static void main(String[] args) {
		/*
		 * VARIABLES
		 */
		Scanner input = new Scanner(System.in);
		beer beer1, beer2;
		beer1 = new beer();
		beer2 = new beer();
		double alcohol;
		String name;
		double weight;
		
		//prompt user for name and alocholic content of beer 1
		System.out.println("Welcome to the party!\nWhat is the name of the first beer?");
		name = input.nextLine();
		beer1.setName(name);
		System.out.println("What is the alcoholic content of the beer?");
		alcohol = input.nextDouble();
		beer1.setAlcohol(alcohol);
		input.nextLine();

		//prompt user for name, alocholic content of beer 2 and weight
		System.out.println("What is the name of the second beer?");
		name = input.nextLine();
		beer2.setName(name);
		System.out.println(beer2.getName());
		System.out.println("What is the alcoholic content of the beer?");
		alcohol = input.nextDouble();
		beer2.setAlcohol(alcohol);
		System.out.println("What is the weight of the consumer of these beers?");
		weight = input.nextDouble();
		
		//show how many beers it would take of each to become intoxicated
		System.out.println("It would take " + beer1.Intoxicated(weight) + " " + beer1.getName() + " beers to become intoxicated.\n" +
		"It would take " + beer2.Intoxicated(weight) + " " + beer2.getName() + " beers to become intoxicated.");
	}

}
