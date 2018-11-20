import java.util.Scanner;
public class arrayexample {

	public static final double ACTUAL_PRICE = 13.53;
	public static void main(String[] args) {
		System.out.println("Welcome to another game thing.\n Give me prices for things.\n CLosest without going over, 5 people.");
		
		double[] prices = new double[10];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < prices.length; i++)
		{
			System.out.println("Enter a price greater than 0");
			double newPrice = input.nextDouble();
			if (newPrice >=0.0)
			{
				prices[i] = newPrice;
			}
			else
			{
				System.out.println("No!");
				prices[i] = 0.0000001;
			}
		}
		
		System.out.println("The actual price is " + ACTUAL_PRICE);
		
		double closestValue = prices[0];
		int winnerindex = -1;
		
		for(int i = 0; i< prices.length;i++)
		{
			if (prices[i] <= ACTUAL_PRICE && prices[i] > closestValue)
			{
				closestValue = prices[i];
				winnerindex = i;
			}
		}
		
		if (winnerindex == -1)
		{
			System.out.println("Everyone lost, boo!");
		}
		else
		{
			System.out.println("Contestest " + winnerindex+ " is the winner index.");
		}

	}

}
