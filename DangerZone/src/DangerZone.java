/*
 * Dylan Desai
 */
import java.util.*;
import java.io.*;

public class DangerZone {

	public static void main(String[] args) {
		/*
		 * VARIABLES
		 */
		Scanner input = new Scanner(System.in);
		String theWord = "";
		
		// get the user input
		System.out.println("Enter a word to replace DANGER with: ");
		theWord = input.nextLine();
		
		//read the file
		readSong("dangerzone.txt", theWord);
		
		//give the method the things that we need for file IO
		//replaceWord("newSong.txt", true, theWord);

	}
	
	public static void readSong(String fileName, String replaceWord)
	{
		String out = "";
		//read the contents of the song
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			PrintWriter writer = new PrintWriter(new FileOutputStream("out.txt"), false);
			//String fileLine = fileScanner.nextLine();
			//String [] splitLine = fileScanner.useDelimiter(" ");
			while (fileScanner.hasNextLine())
			{
				String thing = fileScanner.next();
				String line = fileScanner.nextLine();
				if (thing.equalsIgnoreCase("danger") || thing.equalsIgnoreCase("dangers") || thing.equalsIgnoreCase("danger!"))
				{
					thing = replaceWord;
				}
				if (thing.equalsIgnoreCase("\n"))
				{
					thing = "\n";
				}
				else if (thing.equalsIgnoreCase("\r"))
				{
					thing = "\r";
				}
				else if (thing.equalsIgnoreCase(""))
				{
					thing = "";
				}
				out += (thing + " ");
				
				System.out.print(thing + " ");
				
				
				
			}
			writer.print(out);
			writer.close();
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
