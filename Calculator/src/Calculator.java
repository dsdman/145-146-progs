import java.util.*;
public class Calculator {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number");
		try
		{
		System.out.println(keyboard.nextInt());
		}
		catch (InputMismatchException e)
		{
			System.out.println(e);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		keyboard.close();
	}
}
