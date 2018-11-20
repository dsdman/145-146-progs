/*
 * Written by Dylan Desai
	HOMEWORK 9 DO NOT MARK VETICES, MARK EDGES
 */
import java.util.*;
import java.io.*;

public class wordFinder {
	//for marking marked indices in the matrix
	private static boolean[][] markedVerts;
	
	public static void main(String[] args) {
		/*
		 * VARIABLES
		 */
		char[][] chars;
		ArrayList<String> dict;
		
		//get the random 2d array of characters and set marked verts up with this data
		chars = getCharArray(5);
		markedVerts = new boolean[chars.length][chars.length];
		
		//print the random char array
		for (int i=0;i<chars.length;i++)
		{
			for (int j=0;j<chars[i].length;j++)
			{
				System.out.print(chars[i][j] + " ");
			}
			System.out.println(); 
		}
		
		//more line breaks for clarity	
		System.out.println();
		
		//get the dictionary
		dict = getDict("dict.txt");
		
		//allow the array to be checked
		findWords(chars, dict);
	}
	
	//method to get dictionary from file
	public static ArrayList<String> getDict(String fileName)
	{
		//variables
		Scanner fileReader;
		ArrayList<String> out = new ArrayList<String>();
		String line = "";
		
		//parse the file and return the dictionary
		try
		{
			//setup the reader
			fileReader = new Scanner(new File(fileName));
			
			//get the number of elements and set that equal to the array size
			while (fileReader.hasNextLine())
			{
				line = fileReader.nextLine();
				out.add(line);
			}
			
			//close scanner
			fileReader.close();
		}
		catch (IOException e)
		{
			System.out.println("File not found or is corrupted");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//return output
		return out;
	}
	
	//method that finds the words character by character
	public static void findWords(char[][] letters, ArrayList<String> Dictionary)
	{
		for (int i=0;i<letters.length;i++)
		{
			for (int j=0;j<letters[i].length;j++)
			{				
				//Print current location to find words from
				System.out.println("Starting "+i+ " "+j);
				
				//call the method that adds letters recursively
				addLetters(letters,Dictionary,i,j, "");
			}
			
		}
	}
	
	//recursive method that adds letters to (try) to make a word
	public static void addLetters(char[][] letters, ArrayList<String> Dictionary, int i, int j, String word)
	{
		//clear marked verts
		for (int x=0;x<markedVerts.length;x++)
		{
			for (int y=0;y<markedVerts[x].length;y++)
			{
				markedVerts[x][y] = false;
			}
		}
		
		//call method to check against dictionary if word is between 2 and 5 in length
		if (word.length()>=2 && word.length() <=5)
			checkForWord(word,Dictionary);
		
		//stop if length of word is at 5
		if (word.length()==5)
			return;		
		
		//add letter at current index to word and marked verts
		word+= letters[i][j];
		markedVerts[i][j] = true;
		
		//recursively add neighboring letters (8 possible combos for this)		
		if((i-1>=0) &&(i-1 <letters.length)&& (j+1>=0) && (j+1<letters.length))
		{
			if(letters[i-1][j+1] != 0 && !markedVerts[i-1][j+1])
				addLetters(letters,Dictionary,i-1,j+1, word);
		}		
		if((i>=0) &&(i <letters.length)&& (j-1>=0) && (j-1<letters.length))
		{
			if(letters[i][j-1] != 0 && !markedVerts[i][j-1])
				addLetters(letters,Dictionary,i,j-1, word);
		}
		if((i>=0) &&(i <letters.length)&& (j+1>=0) && (j+1<letters.length))
		{
			if(letters[i][j+1] != 0 && !markedVerts[i][j+1])
				addLetters(letters,Dictionary,i,j+1, word);
		}		
		if((i+1>=0) && (i+1<letters.length) && (j+1>=0) && (j+1 <letters.length))
		{
			if(letters[i+1][j+1] != 0 && !markedVerts[i+1][j+1])
				addLetters(letters,Dictionary,i+1,j+1, word);
		}
		if((i-1>=0) &&(i-1 <letters.length)&& (j-1>=0) && (j-1<letters.length))
		{
			if(letters[i-1][j-1] != 0 && !markedVerts[i-1][j-1])
			{
				addLetters(letters,Dictionary,i-1,j-1, word);
			}
		}
		if((i-1>=0) &&(i-1 <letters.length)&& (j>=0) && (j<letters.length))
		{
			if(letters[i-1][j] != 0 && !markedVerts[i-1][j])
				addLetters(letters,Dictionary,i-1,j, word);
		}
		if((i+1>=0) &&(i+1<letters.length) && (j-1>=0) && (j-1 <letters.length))
		{
			if(letters[i+1][j-1] != 0 && !markedVerts[i+1][j-1])
				addLetters(letters,Dictionary,i+1,j-1, word);
		}
		if((i+1>=0) && (i+1<letters.length) && (j>=0) && (j <letters.length))
		{
			if(letters[i+1][j] != 0 && !markedVerts[i+1][j])
				addLetters(letters,Dictionary,i+1,j, word);
		}
	}
	
	//method that checks word against the dictionary
	public static void checkForWord(String word, ArrayList<String> dict)
	{
		//check each string value in the dictionary against the word
		for (String val: dict)
		{
			if (val.equalsIgnoreCase(word))
			{
				System.out.println("Found Word: "+word);
				return;
			}
		}
	}
	
	//method that creates random character array
	public static char [][] getCharArray(int size)
	{
		//output variable and random generater
		char[][] out = new char[size][size];
		Random numGen = new Random();
		
		//fill it up with random values
		for (int i=0;i<out.length;i++)
		{
			for (int j=0;j<out[i].length;j++)
			{
				out[i][j] = (char)(numGen.nextInt(26) +65);
			}
		}
		
		//return the array
		return out;
	}
}
