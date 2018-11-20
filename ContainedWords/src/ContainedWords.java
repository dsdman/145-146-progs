/*
 * Dylan Desai
 */
import java.util.Arrays;
import java.util.Scanner;

public class ContainedWords {
	public static void main(String[] args)
	{
		//variables
		Scanner input = new Scanner(System.in);
		String word1 = "";
		String word2 = "";
		
		//prompt the user
		System.out.println("Enter two words and the program will check if letters of one is in the other.");
		word1 = input.nextLine();
		word2 = input.nextLine();
		
		//convert the two words into char arrays and sort them
		char[] charWord1 = word1.toCharArray();
		char[] charWord2 = word2.toCharArray();
		Arrays.sort(charWord1);
		Arrays.sort(charWord2);
		word1 = new String(charWord1);
		word2 = new String(charWord2);
		
		//use the recursive method
		if (isContained(word1, word2,charWord1.length,charWord2.length))
		{
			System.out.println("The words are contained");
		}
		else
		{
			System.out.println("The words are not contained");
		}
	}
	
	public static boolean isContained(String aWord1, String aWord2, int length1, int length2)
	{
		//DEBUGGING, display word1 and word2
		//System.out.println("char1: "+aWord1.charAt(length1-1)+" char2: "+aWord2.charAt(length2-1));
		//if length 1 is zero, return true, else return false
		if (length1==0)
		{
			return true;
		}
		else if (length2==0)
		{
			return false;
		}
		//if the last char of string1 equals last char of string 2, decrease both and call method again
		else if (aWord1.charAt(length1-1)==aWord2.charAt(length2-1))
		{
			return isContained(aWord1,aWord2,length1-1,length2-1);
		}
		else
		//decrease length2 and call method again
		{			
			return isContained(aWord1,aWord2,length1,length2-1);
		}
	}

}
