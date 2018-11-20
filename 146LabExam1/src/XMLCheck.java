/*
 * Written by Dylan Desai
 * Lab exam section 6 from https://cse.sc.edu/~shephejj/csce146/Labs/LABEXAM01_XMLZ.html
 */
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class XMLCheck {
	public static void main(String[] args)
	{
		//variables
		Scanner input = new Scanner(System.in);
		String fileName = "";
		
		//prompt the user and use fileName
		System.out.println("Enter the name of an XML file.");
		fileName = input.nextLine();
		
		isValid(fileName);
	}
	
	//checks for valid xml
	public static void isValid(String fileName)
	{
		/*
		 * VARIABLES
		 */
		Scanner fileReader;
		String line = "";
		String temp = "";
		String[] lineSplit;
		LLStack<String> stringStack = new LLStack<String>();
		boolean hasStartTag = false;
		
		//terminate if filename is null
		if (fileName == null)
			return;
		
		//start parsing the file
		try
		{
			fileReader = new Scanner(new File(fileName));
			while (fileReader.hasNext())
			{
				//get the next line and remove extra spaces
				line = fileReader.nextLine();
				line = line.trim();
				line = line.replaceAll("\\s+","");
				
				//check for a valid start tag 
				if (line.charAt(0) == '<' && line.charAt(line.length()-1)=='>' && line.charAt(1) != '/')
				{
					//push the tag
					stringStack.push(line.substring(1,line.length()-1));					
				}
				
				//check for a valid end tag
				if (line.charAt(0) == '<' && line.charAt(line.length()-1)=='>' && line.charAt(1) == '/')
				{
					//pop the tag if it matches the thing in the head of the stack
					temp = line.substring(2,line.length()-1);
					if (temp.equals(stringStack.peek()))
					{
						stringStack.pop();
					}					
				}
			}			
			
			//if there is nothing in the stack, then it was formatted correctly
			if (stringStack.getTotalNum()==0)
			{
				System.out.println("The XML file is formatted correctly");
			}
			else
			{
				System.out.println("The XML file is not formatted correctly.\nThe following tags didn't end:");
				stringStack.print();
			}			
			
			//close the scanner
			fileReader.close();
		}
		catch (IOException e)
		{
			System.out.println("File not found or is currupted");
		}
		catch (Exception e)
		{
			System.out.println("Something else gone wrong.");
		}		
	}
	
}
