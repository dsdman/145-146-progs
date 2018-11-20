/*
 * Dylan Desai
 */

import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;

public class MovieDatabase {
	//Variable for delimiter
	public final String DELIM = "\t";
	
	//attributes
	public static final int DB_SIZE=100;
	private Movie[] movieDatabase;

	//constructor
	public MovieDatabase()
	{
		this.movieDatabase = new Movie[DB_SIZE];
	}
	
	//add movie
	public void addMovie(Movie aMovie)
	{
		int j = 0;
		
		
		for (int i = movieDatabase.length -1; i >=0; i--)
		{
			if (movieDatabase[i] == null)
			{
				j = i;
				
			}
		}
		movieDatabase[j] = aMovie; 
	}
	
	//returns the length of the database
	public static int getDataSize()
	{
		return MovieDatabase.DB_SIZE;
	}
	
	//remove movie
	public void removeMovie(String aName)
	{
		for (int i = 0; i < movieDatabase.length; i++)
		{
			if (movieDatabase[i] != null && movieDatabase[i].nameEquals(aName))
			{
				movieDatabase[i] = null;
			}
		}
	}
	
	//sort by title
	public void sortByTitle()
	{
		//variables needed
		boolean sort = true;
		Movie temp;
		int j = 0;
		char[] movieTitle1 = null; 
		char[] movieTitle2 = null;
		
		//run the bubble sorting algorithm
		while (sort)
		{
			sort = false;
			for (int i = 0 ; i < movieDatabase.length; i++)
			{
				if (movieDatabase[i] != null && movieDatabase[i+1] != null)
				{
					movieTitle1 = movieDatabase[i].getName().toCharArray();
					movieTitle2 = movieDatabase[i+1].getName().toCharArray();
				}
				
				
				if (movieDatabase[i] != null && movieDatabase[i+1] != null && movieTitle1[j] > movieTitle2[j])
				{
					temp = movieDatabase[i];
					movieDatabase[i] = movieDatabase[i+1];
					movieDatabase[i+1] = temp;
					sort = true;
				}
			}
		}
	}
	
	//sort by rating
	public void sortByRating()
	{
		//variables needed
		boolean sort = true;
		Movie temp;
		
		//run the bubble sorting algorithm
		while (sort)
		{
			sort = false;
			for (int i = 0; i < movieDatabase.length; i++)
			{
				if (movieDatabase[i] != null && movieDatabase[i+1] != null && movieDatabase[i].getRating() > movieDatabase[i+1].getRating())
				{
					temp = movieDatabase[i];
					movieDatabase[i] = movieDatabase[i+1];
					movieDatabase[i +1] = temp;
					sort = true;
				}
			}
		}
		
	}
	
	//sort by box office gross
	public void sortByBoxGross()
	{
		//variables needed
		boolean sort = true;
		Movie temp;
		
		//run the bubble sorting algorithm
		while (sort)
		{
			sort = false;
			for (int i = 0; i < movieDatabase.length; i++)
		{
				if (movieDatabase[i] != null && movieDatabase[i +1] != null && movieDatabase[i].getBoxGross() > movieDatabase[i+1].getBoxGross())
				{
					temp = movieDatabase[i];
					movieDatabase[i] = movieDatabase[i+1];
					movieDatabase[i +1] = temp;
					sort = true;
				}
			}
		}
			
	}
	
	//show movies by a director
	public void printByDirector(String aDirector)
	{
		for (int i = 0; i < movieDatabase.length; i++)
		{
			if (movieDatabase[i] != null && movieDatabase[i].getDirector().equalsIgnoreCase(aDirector))
			{
				System.out.println(movieDatabase[i].toString());
			}
		}
	}
	
	//prints the whole "database"
	public void print()
	{
		for (int i = 0; i < movieDatabase.length; i++)
		{
			if (movieDatabase[i] != null)
			System.out.println(movieDatabase[i].toString());
		}
	}
	
	//writes to the file
	public void writeToFile(String fileName)
	{
		try {
			PrintWriter writer = new PrintWriter(new FileOutputStream(fileName));
			for (int i = 0; i < MovieDatabase.getDataSize(); i++)
			{
				/*
				 * FORMAT FOR THE FILE:
				 * Name of movie + delimiter + year + delimiter + rating + delimiter + director + delimiter + box office growth
				 */
				if (movieDatabase[i] == null)
					break;
				writer.println(movieDatabase[i].getName() + DELIM + movieDatabase[i].getYear() + DELIM + movieDatabase[i].getRating() + DELIM + movieDatabase[i].getDirector()
						+ DELIM + movieDatabase[i].getBoxGross());
			}
			
			writer.close();
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//imports from the file
	public void importFromFile(String fileName)
	{
		try
		{
			//opens the file, breaks it by line followed by delimiter, and then extracts needed info to create and add movie
			Scanner fileScanner = new Scanner(new File(fileName));
			while (fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLine = fileLine.split(DELIM);
				if (splitLine.length == 5)
				{
					String name = splitLine[0];
					int year = Integer.parseInt(splitLine[1]);
					int rating = Integer.parseInt(splitLine[2]);
					String director = splitLine[3];
					double boxGross = Double.parseDouble(splitLine[4]);
					this.addMovie(new Movie(name, year, rating, director, boxGross));
				}
				else
				{
					System.out.println("File movies.txt does not exist or is not properly formatted");
				}
			}
			
			fileScanner.close();
		}
		catch (FileNotFoundException e) {
			
			e.getStackTrace();
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}
	}

}
