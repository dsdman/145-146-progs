package forLoopExample;
import java.util.Scanner;

public class octopus {

	public static void main(String[] args) {
		System.out.println("I'm an octopus. I like the number 8");
		System.out.println("Enter a number tht's positive and I'll give you all the multiples of 8");
		
		Scanner keyboard = new Scanner(System.in);
		
		int numberInput = keyboard.nextInt();
		
		if(numberInput <0)
		{
			System.out.println("No way Jose. Blub blub");
			System.exit(0);
			
		}
		/*
		for(int i = 0; i < numberInput; i++)
		{
			if (i % 8 == 0)
			{
				System.out.println(i + " Is divisible by 8");
			}
		}
		*/
		
		for(int i = 0; i <numberInput; i+= 8)
		{
			System.out.println(i + " Is divisible by 8");
		}
	}

}
