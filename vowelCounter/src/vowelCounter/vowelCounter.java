package vowelCounter;

import java.util.Scanner;
public class vowelCounter {

	public static void main(String[] args) {
		/*
	     * VARIABLES
	     */ 
	    Scanner input = new Scanner(System.in);
	    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	    int [] vowelCount = new int[5];
	    char vowelsTemp;
	    int vowelCountTemp;
	    char charTemp;
	    String answer;
	    boolean sort = true;
	    int biggestNum = 0;
	    
	    
	    //prompt
	  System.out.println("Welcome to vowel counter and sorter");
	  System.out.println("Enter a phrase");
	  answer = input.nextLine();
	  
	  
	  //check for vowels ignoring case
	  for (int i = 0; i < answer.length(); i++)
	  {
	   charTemp = answer.charAt(i);
	   charTemp = Character.toLowerCase(charTemp);
	   for (int j = 0; j < vowels.length; j++)
	   {
	    //check if they match
	    if (charTemp == vowels[j])
	    {
	     vowelCount[j] += 1;
	    }
	   }
	  }
	  
	  while (sort)
	  {
		  sort = false;
		  //bubble sort method
		  for (int i = 0; i < vowelCount.length - 1; i++)
		  {
			  if (vowelCount[i] > vowelCount[i + 1])
			  {
				  //keep the valeus for when we swap them later
				  vowelCountTemp = vowelCount[i];
				  vowelsTemp = vowels[i];
				  
				  //swap the values
				  vowelCount[i] = vowelCount[i + 1];
				  vowelCount[i + 1] = vowelCountTemp;
				  vowels[i] = vowels[i + 1];
				  vowels[i + 1]= vowelsTemp;
				  
				  //set sort to true to continue the loop
				  sort = true;
				  
			  }
		  }  
	  }
	  
	  //display the result
	  for (int i = 0; i < vowelCount.length; i++)
	  {
		  System.out.print(vowels[i] + " " + vowelCount[i]);
		  System.out.println();
	  }
	
	  
	  
/*	  //find value of biggest vowel count
	  for (int i = 0; i < vowelCount.length; i++)
	  {
	    if (vowelCount[i] > biggestNum)
	    {
	      biggestNum = vowelCount[i];
	    }
	  }
	  
	  //show results
	  System.out.println("The count of vowels: ");
	  for (int i =0; i<=biggestNum; i++)
	  {
	    for (int j = 0; j<vowels.length;j++)
	    {
	      if(vowelCount[j] == i)
	      {
	        System.out.print(vowels[j] + " " + vowelCount[j]);
	        System.out.println();
	      }
	    }
	  }*/
	  
	 /* System.out.println("\n");
	  
	  for (int i = biggestNum; i >= (0 - vowels.length); i++)
	  {
		  for (int j = 0; j < vowels.length; j++)
		  {
			  if (vowelCount[j] == i)
			  {
				  System.out.print(vowels[j] + " " + vowelCount[j]);
				  System.out.println();
			  }
		  }
	  }*/
		
	}

}
