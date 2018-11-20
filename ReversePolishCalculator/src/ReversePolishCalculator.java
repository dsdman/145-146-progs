/*
 * Written by Dylan Desai
 */
import java.io.*;
import java.util.*;

public class ReversePolishCalculator {

	/*NOTE THAT THE FILE NAME I USED WAS revPol.txt
	 *public static final String FILENAME = "revPol.txt"
	 */
	
	//main method that takes in filename and sends it to the reader
	public static void main(String[] args) {
		//VARIABLES
		Scanner input = new Scanner(System.in);
		String fileName = "";
		ReversePolishCalculator entry = new ReversePolishCalculator();
		
		//greeting and prompt
		System.out.println("Welcome to the reverse polish caclulator.\nWhat is the name of the file?");
		fileName = input.nextLine();
		System.out.println("Hello, why now?");
		//call the method with the reader
		entry.reader(fileName);
		//entry.reader(FILENAME);
		input.close();		
	}
	
	//the method that does the reading, parsing, and displaying
	public void reader(String aFileName)
	{	
		/*
		 * VARIABLES
		 */
		boolean isError = false;
		Scanner fileReader;
		int int1 = 0;
		int int2 = 0;
		String operator = "";
		int result = 0;
		String line = "";
		String[] token;
		LLStack<Integer> intStack = new LLStack<Integer>();
		
		//terminate if filename is null
		if (aFileName ==null)
			return;
		
		//parse the file, do calculations, and display result
		try
		{
			fileReader = new Scanner(new File(aFileName));
			while (fileReader.hasNext())
			{
				//reset the variables
				int1 = 0;
				int2 = 0;
				operator = "";
				result = 0;
				intStack = new LLStack<Integer>();
				isError = false;
				
				//grab next line and token
				line = fileReader.nextLine();
				token  = line.split(" ");
				
				//inform user of calculation and evaluate token
				System.out.println("\nCalculating "+line);
				for (int i=0;i<token.length;i++)
				{
					//the first token must be an integer
					if (i==0 && !this.isInt(token[0]))
					{
						//halt if not integer
						isError = true;
						break;
					}
					
					//checks for an integer and pushes onto stack 
					if (this.isInt(token[i]))
					{
						intStack.push(Integer.parseInt(token[i]));
					}					
					//check for an operator and at least two things in the stack
					else if (this.isOperator(token[i]) && intStack.getTotalNum()>=2)
					{
						//pop the two tokens, do the calculation, and push the result
						operator = token[i];
						int1 = intStack.pop();
						int2 = intStack.pop();
						result = calculate(int1, int2, operator);
						intStack.push(result);
					}
					else
					{
						//if none of the above, then the token is bad
						System.out.println("Exception! For input String: "+"\""+token[i]+"\"");
						isError = true;
						break;
					}				
				}
				
				//if there is more than one item or if there are no items in the stack after line was processed, then bad expression
				if (intStack.getTotalNum() >1 ||intStack.getTotalNum() ==0)
					isError = true;				
				
				//tell user if the string is a bad expression and return a result of zero
				if (isError)
				{
					result = 0;
					System.out.println("Ill formatted expression");
					System.out.println("Result is " + result);
				}
				else
				{
					//the result is the peek of the stack
					result = intStack.peek();
					System.out.println("Result is " + result);
				}
				/*debugging, print stack
				System.out.println("This is the stack: ");
				intStack.print();*/
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
	}
	
	//checks whether the token is an integer
	public boolean isInt(String aToken)
	{
		//try to parse token into an Integer
		try
		{
			Integer.parseInt(aToken);
		}
		catch (NumberFormatException e)
		{
			return false;
		}
		catch (NullPointerException e)
		{
			return false;
		}
		catch (Exception e)
		{
			return false;
		}
		
		//if there were no exceptions, then it is an integer
		return true;		
	}
	
	//checks whether the token is an operator
	public boolean isOperator(String aToken)
	{
		//return false if null
		if (aToken ==null)
		{
			return false;
		}
		
		//match using regex
		if (aToken.matches("[+-/*]"))
			return true;
		else
			return false;
	}
	
	//does the calculations
	public int calculate(int num1, int num2, String anOperator)
	{
		//check for null operator
		if (anOperator ==null)
		{
			return 0;
		}
		
		//output variable
		int out = 0;
		
		//does the integer calculation depending on the operator 
		try
		{
			switch (anOperator)
			{
			case "*":
				out = num2*num1;
				break;
			case "/":
				out = num2/num1;
				break;
			case "-":
				out = num2-num1;
				break;
			case "+":
				out = num2+num1;
				break;
			}
			return out;
		}
		catch (Exception e)
		{
			System.out.println("Can't divide by zero");
			out = 0;
			return out;
		}
	}
}
