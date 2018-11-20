/*
 * Dylan Desai
 */
import java.util.Scanner;
public class RecursivePaladrome {

	public static void main(String[] args) {
		// Variables
		Scanner input = new Scanner(System.in);
		String answer = "";
		
		//greeting and prompt
		System.out.println("Enter a word and I will determine if it is a paladrome.");
		answer = input.nextLine();
		
		//call the paladrome method
		if(paladrome(answer))
		{
			System.out.println("The word "+"\""+answer+"\" is a paladrome.");
		}
		else
		{
			System.out.println("The word "+"\""+answer+"\" is not a paladrome.");
		}
	}
	
	//paladrome method
	public static boolean paladrome(String aString)
	{
		//check for null string
		if (aString ==null)
			return false;
		
		//trim the string, remove spaces, and convert to uppercase
		aString = aString.trim();
		aString = aString.replaceAll("\\s+","");
		aString = aString.toUpperCase();
		
		//System.out.println("NEW STRING: "+aString.substring(1,aString.length()-1));
		//if only 1 character, then it is a paladrome
		if (aString.length() ==1)
		{
			return true;
		}
		//check if first and last characters are the same
		else if (aString.charAt(0) == aString.charAt(aString.length()-1))
		{
			
			return paladrome(aString.substring(1, aString.length()-1));			
		}
		else
		{
			return false;
		}
	}

}
