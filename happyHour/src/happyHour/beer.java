/*
 * Dylan Desai
 */
package happyHour;

public class beer {
	//attributes
	private String name;
	private double alcohol;
	
	//constructor
	public beer()
	{
		this.name = "Nothing";
		this.alcohol = 0.0;
	}
	
	//accessors
	public String getName()
	{
		return this.name;
	}
	public double getAlcohol()
	{	
		return this.alcohol;
	}
	
	//mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setAlcohol(double aAlcohol)
	{
		//check for only values between 0 and 1
		if (aAlcohol < 0 || aAlcohol > 1)
		{
			System.out.println("Invalid alcohol content.");
		}
		else
		{
			this.alcohol = aAlcohol;	
		}
		
	}
	
	//other methods
	public double Intoxicated(double aWeight)
	{
		double out = ((0.08 + 0.015) * (aWeight / (12.0 * 7.5 * this.alcohol)));
		return out;
	}

}
