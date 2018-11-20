import java.util.*;
import java.io.*;

public class UnderGraduateRecordSystem {
	public static final String DELIM = "\t"; //creates the delimiter
	
	public static void main(String[] args) {
		/* format for the file:
		 * header
		 * Number of Students /t <<numStudents>> /n
		 * <<name>> /t <<ID>> /t <<level>> /n
		 * Same as above numSTuents number of times
		 */
		
		
		/*
		 * How to Print to the file
		 * 1. Create a file protocol delimiter
		 */
		
		//writes to file
		
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream("Name"), true); //fileoutputStream is the name of the file in a string, the boolean is append or not (true o false)
			//print the header
			fileWriter.println("Number of Students" + DELIM+ 3);
			//print the body
			for (int i = 0; i < 3; i++)
			{
				fileWriter.println("This is a name" + DELIM + "69" + DELIM + "FRESHMEN");
			}
			fileWriter.close(); //ALWAYS CLOSE THE FILE STREAM AT THE END
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		//reading to the file
		try
		{
			Scanner fileScanner = new Scanner(new File("name"));
			String fileLine = fileScanner.nextLine();
			String[] splitLine = fileLine.split(DELIM);
			String [] Stuff;
			if (splitLine.length == 2)
			{
				//initalize stuff at element 2 of the array splitline
			}
			else
			{
				System.out.println("No");
				//return null
			}
			
			int count = 0;
			while (fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitLine = fileLine.split(DELIM);
				if (splitLine.length == 3)
				{
					//parse data here
					
					
				}
				else
				{
					System.out.println("No");
					
				}
			}
			
			fileScanner.close();
			//return something
			
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

}
