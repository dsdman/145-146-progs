/*
 * Written by Dylan Desai
 */
import java.util.Random;
import java.util.*;
import java.io.*;

public class wordFinding {
	public static void main(String[] args)
	{
		//variables
		Random rand = new Random();
		char[][] array = new char[5][5];
		
		//TODO generate the array of characters
		
		//TODO wordfinder method
		wordFinder(array);
	}
	
	public static void wordFinder(char[][] array)
	{
		//variables
		ArrayList<String> foundWords = new <String>ArrayList();
		
		//TODO check for 5 length
		
		//TODO check for letters and words
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;i++)
			{
				recursiveSearcher(array,i,j, "dictionary.txt");
			}
		}
	}
	
	public static void recursiveSearcher(char[][] array, int i, int j, String fileName)
	{
		//variables
		Scanner fileReader = new Scanner(new File(fileName));
		ArrayList<String> letters = new ArrayList<String>();
		String word = "";
		
		//add letters
		letters.add(""+array[i][j]);
		if (letters.size()<2)
		{
			//recursive call
			addLetters(array,i,j,letters);
		}
		else if (letters.size() ==5)
		{
			//check whether it is a word
			for (int x=0;i<letters.size();x++)
			{
				word += "" + letters.get(x);
			}
			while (fileReader.hasNext())
			{
				if (word.equals(fileReader.next()))
				{
					
				}
			}
		}
	}
	
	private static void addLetters(char[][] array, int i, int j, ArrayList wl)
	{
		if (i<0 || i>=array.length || j<0 || j>array.length)
		{
			System.out.println("This is bad");
			return;
		}
		//8 possible letters
		if (!((i+1) <0 || (i+1)>=array.length) && (j+1)<0 || (j+1)>=array.length)
		{
			addLetters()
		}
	}
}
