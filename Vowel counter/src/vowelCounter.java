/*
 * Written by Dylan Desai
 */
import java.io.*;
import java.util.*;

public class vowelCounter {
	//variable for filename
	public static final String FILENAME = "example.txt";
	
	public static void main(String[] args) {
		//Count and report the number
		int vowelCount = getVowelCount();
		System.out.println("The file "+FILENAME+" has AEIOU in order "+vowelCount+" times.");

	}
	
	//counter method
	public static int getVowelCount()
	{
		/*
		 * VARIABLES
		 */
		int out = 0;
		Scanner fileReader;
		String word = "";
		String vowels = "aeiou";
		String onlyVowels = "";
		
		try
		{
			//create a scanner to analyze the file
			fileReader = new Scanner(new File(FILENAME));
			while (fileReader.hasNext())
			{
				//get the next word and remove spaces from it
				word = fileReader.next().toLowerCase();
				word = word.replaceAll("\\s+","");
				
				//removes all consonants
				for (int i =0;i<word.length();i++)
				{
					if (word.charAt(i)=='a'|| word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
					{
						onlyVowels += word.charAt(i);
					}
				}
				
				//check for vowels in the String containing vowels
				if (onlyVowels.contains(vowels))
				{
					out+=1;
					onlyVowels = onlyVowels.replace(vowels, "");
				}
			}			
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
		
		//return output
		return out;
	}
}
