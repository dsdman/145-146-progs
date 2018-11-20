/*
 * Written by Dylan Desai
 */
import java.io.*;
import java.util.*;

public class FruitTree {
	//for tab deliminated file
	public static final String DELIM = "\t";
	
	public static void main(String[] args) {
		//variables
		LinkedBSTree<Fruit> fruitTree;
		
		//greeting and call method to populate tree
		System.out.println("Welcome to the tree of Fruit.\nPopulating the tree from file");
		fruitTree = populateFromFile("fruitFile.txt");
		
		//print the in-order traversal
		System.out.println("\nPrinting the in-order traversal");
		fruitTree.printInOrder();
		
		//print the pre-order traversal
		System.out.println("\nPrinting the pre-order traversal");
		fruitTree.printPreOrder();
		
		//print the post-order traversal
		System.out.println("\nPrinting the post-order traversal");
		fruitTree.printPostOrder();
		
		//delete, then print in-order
		System.out.println("\nDeleting Apple 0.4859853412170728");
		fruitTree.delete(new Fruit("Apple", 0.4859853412170728));
		System.out.println("Printing in-order traversal");
		fruitTree.printInOrder();
		
		//goodbye
		System.out.println("\nTesting complete. The fruit tree works.");
	}
	
	//method to populate tree and return it from file
	public static LinkedBSTree<Fruit> populateFromFile(String fileName)
	{
		/*
		 * variables
		 */
		LinkedBSTree<Fruit> out = new LinkedBSTree<Fruit>();
		Scanner fileReader;
		String type = "";
		double weight = 0.0;
		String line;
		String[] parseLine;
		
		//parse the file and populate the tree
		try
		{
			fileReader = new Scanner(new File(fileName));
			while (fileReader.hasNextLine())
			{
				//get the next line and separate it
				line = fileReader.nextLine();
				parseLine = line.split(DELIM);
				
				//if it is formatted correctly, add it to the tree
				if (parseLine.length ==2)
				{
					type = parseLine[0];
					weight = Double.parseDouble(parseLine[1]);
					out.insert(new Fruit(type, weight));
				}
				else
				{
					System.out.println("File is not formatted correctly.");
				}
			}
			//close the scanner
			fileReader.close();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}		
		return out;
	}
}