
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a nmber 1 or more and I'll give you the factorial");
		
		int factInput = keyboard.nextInt();
		int factNumber = factInput;
		int factorial = 1;
		
		if(factNumber <=0) //check for invalid input
		{
			System.out.println("Nothing");
			System.exit(0);
		}
		
		do
		{
			factorial *=factNumber;
			factNumber --;
		
		}
		while (factNumber > 0);
		
		System.out.println("the factorial of " + factInput + " Is " + factorial);
		

	}

}
