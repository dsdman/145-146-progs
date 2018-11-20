/*
 * Written by Dylan Desai
 */
import java.util.*;
import java.io.*;

public class Showcase {
	//delimiter is a tab
	public static final String DELIM = "\t";
	//instance variables
	private Prize[] showcase;
	private Prize[] randomPrizes;
	
	//default constructor
	public Showcase()
	{
		this.showcase = new Prize[50];
		this.randomPrizes = new Prize[5];
	}
	
	//method to initialize the arrays (so I don't have to deal with null pointer exceptions)
	public void initializeShowcase()
	{
		for (int i=0;i<showcase.length;i++)
		{
			showcase[i] = new Prize();
		}
		for (int i=0;i<randomPrizes.length;i++)
		{
			randomPrizes[i] = new Prize();
		}
	}
	
	//method to populate the showcase with prizes from file
	public void fillShowcase()
	{
		/*
		 * VARIABLES
		 */
		Scanner fileReader;
		int prizeNum = 0;
		String name = "";
		int price = 0;
		String line = "";
		String[] splitLine;
		
		try
		{
			//create a scanner to read file
			fileReader = new Scanner(new File("prizeList.txt"));
			
			while (fileReader.hasNextLine())
			{
				//Parse info in file to array
				line = fileReader.nextLine();
				splitLine = line.split(DELIM);				
				if (splitLine.length == 2)
				{
					name = splitLine[0];
					price = Integer.parseInt(splitLine[1]);
					showcase[prizeNum] = new Prize(name, price);
					prizeNum++;
				}
			}
			
			//close the scanner
			fileReader.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
		/*//for debugging only
		for (int i=0;i<showcase.length;i++)
		{
			System.out.println(showcase[i].getName() + " " + showcase[i].getPrice());
		}
		*/
	}
	
	//method to populate the random prizes from the other array
	public void fillRandomPrizes()
	{
		 Random r = new Random();
		 int randomInt = -1;
		 
		 for(int i=0;i<randomPrizes.length;i++)
		 {
			 randomInt = r.nextInt(showcase.length);
			 randomPrizes[i] = showcase[randomInt];
		     /*for debugging only
			 System.out.println(randomPrizes[i].getName() + " " + randomPrizes[i].getPrice());
			 */			
		 }
	}
	
	//method to return random prize names
	public String toString()
	{
		String out = "";
		for (int i=0;i<randomPrizes.length;i++)
		{
			out+= randomPrizes[i].getName() + "\n";
		}
		return out;
	}
	
	//method to return total price of random prizes
	public int getTotalPrice()
	{
		int total = 0;
		for (int i=0;i<randomPrizes.length;i++)
		{
			total+=randomPrizes[i].getPrice();
		}
		return total;
	}
}
