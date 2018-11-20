package forLoopExample;
import java.util.Scanner;
public class drawBox {

	public static void main(String[] args) {
		System.out.println("I can draw a box with stars\n Give me a length followed by a width");
		
		Scanner keyboard = new Scanner(System.in);
		
		int length = keyboard.nextInt();
		int width = keyboard.nextInt();
		
		if( length <= 0 || width <= 0)
		{
			System.out.println("No.");
			System.exit(0);
		}
		
		for (int i = 0; i < length; i++) //up and down
		{
			for (int j = 0; j < width; j++) //right and left
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
