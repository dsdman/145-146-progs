
public class StringHelper {
	//meshStrings
	public static String meshStrings(String string01, String string02)
	{
		//variables
		String out = "";
		String biggestString = "";
		
		//determine which string is bigger
		if (string01.length() > string02.length())
		{
			biggestString = string01;
		}
		else
		{
			biggestString = string02;
		}
		
		//mesh the strings
		for (int i = 0; i < biggestString.length(); i++)
		{
			//add the character to output if the it isn't null at that index
			if (i >= 0 && i< string01.length())
			{
				out += string01.charAt(i);
			}
			if (i >=0 && i < string02.length())
			{
				out += string02.charAt(i);
			}			
				
					
		}
		
		return out;
	}
	
	//replacevowelswithoodle
	public static String replaceVowelsWithOodle(String string01)
	{
		//variables
		String out = "";
		String copy = "";
		int oldi = -1;
		//replace the vowels with oodle
		for (int i = 0; i < string01.length(); i++)
		{
			if (string01.charAt(i) == 'a' || string01.charAt(i) == 'e'|| string01.charAt(i) == 'i'|| string01.charAt(i) == 'o'|| string01.charAt(i) == 'u'
					|| string01.charAt(i) == 'A' || string01.charAt(i) == 'E' || string01.charAt(i) == 'I' || string01.charAt(i) == 'O' || string01.charAt(i) == 'U')
			{
				//out = out;
				copy = string01.substring(oldi +1,i);
				copy += "oodle";
				out += copy;
				oldi = i;
			}
			
		}
		return out;
	}
	
	//weight method
	public static double weight(String string01)
	{
		double weight = 0.0;
		for (int i = 0; i < string01.length(); i++)
		{
			if (string01.charAt(i) == 'a' || string01.charAt(i) == 'e'|| string01.charAt(i) == 'i'|| string01.charAt(i) == 'o'|| string01.charAt(i) == 'u'
					|| string01.charAt(i) == 'A' || string01.charAt(i) == 'E' || string01.charAt(i) == 'I' || string01.charAt(i) == 'O' || string01.charAt(i) == 'U')
			{
				weight += 2.5;
			}
			else
			{
				weight += 3.4;
			}
			
		}
		return weight;
	}

}
