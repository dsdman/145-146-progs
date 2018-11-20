/**
 * Dylan Desai
 * I DON'T KNOW WHERE OR WHO MY PARTER (DARRELL SINGLETON) WAS, SO I DID THIS PROJECT ALONE
 */
import java.util.Scanner;
public class matrixAdd {
  
  
  public static void main(String[] args) { 
    /*
     * Objects and variables 
     */
    Scanner input = new Scanner(System.in);
    int[][] A; //matrix A
    int[][] B; //matrix B
    int[][] C; //Sum matrix    
    int Al = 0; 
    int Ah = 0;
    int Bl = 0;
    int Bh = 0;
    
    
    //prompt the user
    System.out.println("Length of Matrix A");
    Al = input.nextInt();
    System.out.println("Height of Matrix A");
    Ah = input.nextInt();
    
    //Give the dimensions of the array
    A = new int[Al][Ah];
    
    //populate the array
    for (int i = 0; i < Al; i++)
    {
      for (int j = 0; j <Ah; j++)
      {
        System.out.println("Enter a value for Matrix A, position " + (i + 1) + "," + (j +1));
        A[i][j] = input.nextInt();
      }
    }
    
    //prompt the user
    System.out.println("Length of Matrix B");
    Bl = input.nextInt();
    System.out.println("Height of Matrix B");
    Bh = input.nextInt();
    
    //Give the dimensions of the array
    B = new int[Bl][Bh];
    
    //populate the array
    for (int i = 0; i < Bl; i++)
    {
      for (int j = 0; j <Bh; j++)
      {
        System.out.println("Enter a value for Matrix B, position " + (i + 1) + "," + (j +1));
        B[i][j] = input.nextInt();
      }
    }
   
   
    //only do the calculation if the dimensions are equal
    if (Al == Bl && Ah == Bh)
    {
      //give sum matrix dimensions
      C = new int[Al][Ah];
      
      //display and do the calculation
      for (int i = 0; i < Al; i++)
      {
        for (int j = 0; j < Ah; j++)
        {
          System.out.print(A[i][j] + " ");
        }
        System.out.println();
      }
      
      System.out.println("+");
      
      for (int i = 0; i < Bl; i++)
      {
        for (int j = 0; j <Bh; j++)
        {
          System.out.print(B[i][j] + " ");
        }
        System.out.println();
      }
      
      System.out.println("=");
      
      for (int i = 0; i < C.length; i++)
      {
        for (int j = 0; j < C[i].length; j++)
        {
          C[i][j] = A[i][j] + B[i][j];
          System.out.print(C[i][j] + " ");
        }
        System.out.println();
      }
      
    }
    else
    {
      System.out.println("Can't add these! Dimension mismatch");
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
