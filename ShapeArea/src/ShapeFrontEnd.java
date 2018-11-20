/*
 * Dylan Desai
 */
import java.util.Scanner;

public class ShapeFrontEnd {

	public static void main(String[] args) {
		/*
		 * VARIABLES
		 */
		Scanner input = new Scanner(System.in);
		String answer = "";
		String shapeType = "";
		double area = 0.0;
		double dimension1 = 0.0;
		double dimension2 = 0.0;
		int answerNum = 0;
		ShapeCollection shapes = new ShapeCollection();
		
		System.out.println("Welcome to the Shape Collection.");
		while (answerNum != 9)
		{
			//prompt the user
			System.out.println("Enter 1: Add a shape\nEnter 2: Remove a shape\nEnter 9: Quit");
			answer = input.nextLine();
			if (answer.equalsIgnoreCase(""))
			{
				System.out.println("No!");
				System.exit(0);
			}
			else
			{
				answerNum = Integer.parseInt(answer);	
			}
			
			//options
			switch(answerNum)
			{
			case 1:
				System.out.println("What type of shape?\nRectangle, Triangle, or Circle?");
				answer = input.nextLine();
				//more options
				if (answer.equalsIgnoreCase("Rectangle"))
				{
					System.out.println("Enter a length followed by a height (ex. 1.0 2.0).");
					answer = input.nextLine();
					//get the length and height
					dimension1 = Double.parseDouble(answer.substring(0, answer.indexOf(" ")));
					dimension2 = Double.parseDouble(answer.substring(answer.indexOf(" ") + 1, answer.length()));
					if (dimension1 >0 && dimension2 >0)
					{
						//add the shape to the collection
						shapes.addShape(new Rectangle(dimension1, dimension2));
					}
					else if (dimension1 <=0 && dimension2 <=0)
					{
						System.out.println("Invalid length and height");
					}
					else if(dimension1 <=0)
					{
						System.out.println("Invalid length");
					}
					else if (dimension2 <=0)
					{
						System.out.println("Invalid height");
					}
				}
				else if(answer.equalsIgnoreCase("Triangle"))
				{
					System.out.println("Enter a base followed by a height (ex. 1.0 2.0).");
					answer = input.nextLine();
					//get the base and height
					dimension1 = Double.parseDouble(answer.substring(0, answer.indexOf(" ")));
					dimension2 = Double.parseDouble(answer.substring(answer.indexOf(" ") + 1, answer.length()));
					if (dimension1 >0 && dimension2 >0)
					{
						//add the shape to the collection
						shapes.addShape(new Triangle(dimension1, dimension2));
					}
					else if (dimension1 <=0 && dimension2 <=0)
					{
						System.out.println("Invalid length and height");
					}
					else if(dimension1 <=0)
					{
						System.out.println("Invalid base");
					}
					else if (dimension2 <=0)
					{
						System.out.println("Invalid height");
					}
				}
				else if (answer.equalsIgnoreCase("Circle"))
				{
					System.out.println("Enter a radius (ex. 1.0).");
					answer = input.nextLine();
					//get the radius
					dimension1 = Double.parseDouble(answer);
					if (dimension1 >0)
					{
						//add the shape to the collection
						shapes.addShape(new Circle(dimension1));
					}
					else
					{
						System.out.println("Invalid radius");
					}
				}
				break;
			case 2:
				//prompt for shape and area
				System.out.println("Enter the shape type.(Rectangle, Triangle, and Circle)");
				shapeType = input.nextLine();
				System.out.println("Enter an area");
				area = input.nextDouble();
				//remove the shape from the collection
				shapes.removeShape(shapeType, area);
				//putting this here so the program doesn't freeze
				input.nextLine();
				break;
			case 9:
				System.out.println("Goodbye");
				System.exit(0);
				break;
			default:
				System.out.println("No!");
				break;
			}
			
			//print out the shapes and add blank line for readibility purposes
			System.out.println();			
			shapes.printShapes();
			System.out.println();
		}
		
		input.close();
	}

}
