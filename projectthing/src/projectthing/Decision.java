package projectthing;
import java.util.Scanner;
public class Decision {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String Cont1prize = "nothing";
		String Cont2prize = "nothing";
		
		String boxPrize = "Bag of Candy";
		String dollarPrize = "$1";
		String pocketPrize = "$10 gift card";
		
		System.out.println("Contestant 1. I will give you this crisp $1 bill\n"
				+ "Will you give contestant 2 the dollar for what's in the box, what's in my pocket, or keep the dollar");
		String answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("box"))
		{
			Cont1prize = boxPrize;
			System.out.println("Contestant 2. WIll you choose the pocket or the dollar?");
			answer = keyboard.nextLine();
			
			if(answer.equalsIgnoreCase("dollar"))
			{
				Cont2prize = dollarPrize;
			}
			else if (answer.equalsIgnoreCase("pocket"))
			{
				Cont2prize = pocketPrize;
			}
			else
			{
				System.out.println("I give up");
			}
		}
		else if (answer.equalsIgnoreCase("pocket"))
		{
			Cont1prize = pocketPrize;
			System.out.println("Contestant 2. Will you choose the box or the dollar?");
			answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("dollar"))
			{
				Cont2prize = dollarPrize;
			}
			else if (answer.equalsIgnoreCase("box"))
			{
				Cont2prize = boxPrize;
			}
			else
			{
				System.out.println("lol wut?");
			}
			
		}
				
		
	}

}
