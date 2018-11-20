/*
 * Dylan Desai
 */
public class Movie {
	//attributes
	private String name;
	private int year;
	private int rating;
	private String director;
	private double boxGross;
	
	//constructors
	public Movie()
	{
		//default values
		this.name = "Nothing yet";
		this.year = 0000;
		this.rating = 1;
		this.director = "Clint Eastwood";
		this.boxGross = 0.0;
	}
	public Movie(String aName, int aYear, int aRating, String aDirector, double aGross)
	{
		//use the mutators here
		this.setName(aName);
		this.setYear(aYear);
		this.setRating(aRating);
		this.setDirector(aDirector);
		this.setBoxGross(aGross);
	}
	
	//getters and setters
	public String getName()
	{
		return this.name;
	}
	public int getYear()
	{
		return this.year;
	}
	public int getRating()
	{
		return this.rating;
	}
	public String getDirector()
	{
		return this.director;
	}
	public double getBoxGross()
	{
		return this.boxGross;
	}
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setYear(int aYear)
	{
		if (aYear >= 0)
		{
			this.year = aYear;
		}
	}
	public void setRating(int aRating)
	{
		if (aRating >= 1 && aRating <= 5)
		{
			this.rating = aRating;
		}
	}
	public void setDirector(String aDirector)
	{
		this.director = aDirector;
	}
	public void setBoxGross(double aGross)
	{
		if (aGross >=0)
		{
			this.boxGross = aGross;
		}
	}
	
	//other methods
	public String toString()
	{
		return "NAME: " + this.name + " YEAR: " + this.year + " RATING: " + this.rating + " DIRECTOR: " + this.director + " BOX OFFICE GROSS: " + this.getBoxGross();
	}
	
	public boolean nameEquals(String aName)
	{
		return aName != null && this.name.equals(aName);
	}
}
