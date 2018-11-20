/*
 * FILE IO
 */
import java.util.*;
import java.io.*;
public class RecordSystem {
	public static void main (String[] args)
	{
		//make a reader
		try
		{
		Scanner fileReader = new Scanner(new File ("file.txt"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
