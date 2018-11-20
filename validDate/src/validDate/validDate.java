package validDate;
import java.util.Scanner;
public class validDate {

	public static void main(String[] args) {
		/*
	     * ALL OF THE OBJECTS AND VARIABLES ARE GOING HERE!!!
	     */
	    Scanner input = new Scanner(System.in);
	    String date;
	    String copyDate;
	    String month, day;
	    int monthint, dayint;
	    int length;
	    int slashindex;
	    boolean validDay = false;
	    boolean validMonth = false;
	    
	    //prompt the user for a date and get the value as a string
	    System.out.println("Enter a date in format mm/dd to see if it's valid or not");
	    date = input.nextLine();
	    copyDate = date;
	    
	    //take the month and day from the main string
	    length = copyDate.length();    
	    slashindex = copyDate.indexOf("/");    
	    month = copyDate.substring(0,slashindex);
	    day = copyDate.substring(slashindex + 1,length);
	    //System.out.println(day);
	    
	    //convert the month and day to integer
	    monthint = Integer.parseInt(month);    
	    dayint = Integer.parseInt(day);
	    
	    //check if the month is valid
	    if (monthint >= 1 && monthint <= 12)
	    {
	      validMonth = true;
	      //System.out.println(validMonth);
	    }
	    else
	    {
	      validMonth = false;
	      //System.out.println(validMonth);
	    }
	    
	    //check if the day is valid ON ANY OF THE 30 DAY MONTHS
	    if (monthint == 4 || monthint == 6 || monthint == 9 || monthint == 11)
	    {
	      if (dayint >= 31 || dayint <1)
	      {
	        validDay = false;        
	        //System.out.println(validDay);
	      }
	      else if (dayint >=1 && dayint <= 30)
	      {
	        validDay = true;
	        //System.out.println(validDay);
	      }
	    
	      
	      
	    }
	    
	    //CHECK FOR FEBRUARY
	     if (monthint == 2)
	    {
	      if (dayint >=1 && dayint <=29)
	      {
	        validDay = true;
	        //System.out.println(validDay);
	      }
	      else if (dayint >29 || dayint <1)
	      {
	        validDay = false;
	        //System.out.println(validDay);
	      }
	    }
	     
	    //CHECK THE REST OF THE MONTHS
	    if (monthint == 1 || monthint == 3 || monthint == 5 || monthint == 7 || monthint == 8 ||  monthint == 10 || monthint == 12)
	    {
	      if (dayint >=1 && dayint <=31)
	      {
	        validDay = true;
	        //System.out.println(validDay);
	      }
	      else if (dayint <1 || dayint >31)
	      {
	        validDay = false;
	        //System.out.println(validDay);
	      }
	    }
	   
	    
	   //display if the date is valid or not
	    if (validDay && validMonth)
	    {
	      System.out.println("The date " + copyDate + " is valid");  
	    }
	    else
	    {
	      System.out.println("The date " + copyDate + " is not valid");  
	    }

	}

}
