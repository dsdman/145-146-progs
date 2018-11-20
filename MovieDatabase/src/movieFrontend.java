/*
 * Dylan Desai
 */

import java.util.Scanner;
public class movieFrontend {

	
	//main method, contains front-end
	public static void main(String[] args) {
		/*
		 * VARIABLES
		 */
		MovieDatabase movieCollection = new MovieDatabase();
		Scanner input = new Scanner(System.in);
		int answer = -1;
		String name = "";
		int year = 0;
		int rating = 0;
		String director = "";
		double boxGross = 0;
		
		
		//prompt the user
		System.out.println("Welcome to the movie database.");
		
		while (answer != 9)
		{
			System.out.println("\nEnter 0 to add a movie\nEnter 1 to remove a movie by title\nEnter 2 to sort movies by title\n"
					+ "Enter 3 to sort movies by rating\nEnter 4 to sort movies by box office gross\nEnter 5 to show movies by director\n"
					+ "Enter 6 to print the database to a file\nEnter 7 to import movies from file\nEnter 8 to show current database\nEnter 9 to quit");
			answer = input.nextInt();
			
			
			//the choices
			switch (answer)
			{
				case 0:
					System.out.println("Enter the movie name");
					input.nextLine();
					name = input.nextLine();
					System.out.println("Enter the year of release");
					year = input.nextInt();
					System.out.println("Enter the rating of the movie");
					rating = input.nextInt();
					input.nextLine();
					System.out.println("Enter the director");
					director = input.nextLine();
					System.out.println("Enter the box office gross");
					boxGross = input.nextDouble();
					movieCollection.addMovie(new Movie(name, year, rating, director, boxGross));
					break;
				case 1:
					System.out.println("Enter the movie name");
					input.nextLine();
					name = input.nextLine();
					movieCollection.removeMovie(name);
					break;
				case 2:
					movieCollection.sortByTitle();
					break;
				case 3:
					movieCollection.sortByRating();
					break;
				case 4:
					movieCollection.sortByBoxGross();
					break;
				case 5:
					input.nextLine();
					System.out.println("Enter the name of the director");
					director = input.nextLine();
					movieCollection.printByDirector(director);
					break;
				case 6:
					movieCollection.writeToFile("movies.txt");
					System.out.println("Finished writing to movies.txt");
					break;
				case 7:
					movieCollection.importFromFile("movies.txt");
					System.out.println("Added movies from movies.txt");
					break;
				case 8:
					System.out.println("Current movie database: ");
					movieCollection.print();
					break;
				case 9:
					System.out.println("Goodbye.");
					break;
				default:
					System.out.println("Invalid response. Please only enter one of the choices.");
			}
			
			
		}
		
		//close scanner
		input.close();
	}
	
}
