package nameSort;

/**
 * Written by Dylan Desai
 */
import java.util.Scanner;
public class nameSort {
  
  
  public static void main(String[] args) { 
    /*
     * VARIABLES GOING HERE
     */
    Scanner input = new Scanner(System.in);
    boolean sort = true;
    String lastName1, lastName2;
    int spaceIndex, spaceIndex2;
    String[] names = new String[10];    
    String temp;
    
    //greet user
    System.out.println("Enter 10 names so that way this program can sort them");
   
    //populate the array
    for (int i = 0; i < names.length; i++)
    {
      System.out.println("Enter person " + (i+1));
      names[i] = input.nextLine();
        
      
    }
    
    //sort the names by last
    while (sort)
    {
      sort = false;
      for (int i = 0; i < names.length -1; i++)
      {
        //take the last names to sort
        spaceIndex = names[i].indexOf(" ");
        lastName1 = names[i].substring(spaceIndex, names[i].length());
        spaceIndex2 = names[i + 1].indexOf(" ");
        lastName2 = names[i + 1].substring(spaceIndex2, names[i + 1].length());
        
        //if the unicode value of first string is greater than second string, It'll be positive using compareto method.
        if (lastName1.compareToIgnoreCase(lastName2) > 0)
        {
          temp = names[i]; // keep the value for when we swap
          names[i] = names[i + 1]; //swap the first value
          names[i + 1] = temp; // swap the second value
          sort = true; // set boolean true to swap next time
        }      
        
        
      }
      
      
    }
    
    //show sorted names
    System.out.println("Sorted names are: ");
    
    for (int i = 0; i < names.length; i++)
    {
      System.out.println(names[i]);
    }
                                 
    
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
