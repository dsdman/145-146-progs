/*
 * Written by Dylan Desai
 */
public class Fruit implements Comparable {
	//instance variables
	private String type;
	private double weight;
	
	//constructors
	public Fruit()
	{
		type = "fruit";
		weight = 0.0;
	}
	public Fruit(String aType, double aWeight)
	{
		//use setters
		setType(aType);
		setWeight(aWeight);
	}
	
	//getters and setters
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		if (weight >0)
		this.weight = weight;
	}
	
	//toString method
	public String toString()
	{
		return this.type + " " + this.weight;
	}
	
	//equals method
	public boolean equals(Fruit aFruit)
	{
		return aFruit!=null && this.type.equals(aFruit.getType()) && this.weight == aFruit.getWeight();
	}
	
	//compareTo method
	public int compareTo(Object aFruit)
	{
		Fruit F = new Fruit();
		
		//create a Fruit from object to compare using type casting
		try
		{
			F = (Fruit)aFruit;
		}
		catch (Exception e)
		{
			System.out.println("Object must be of type \"Fruit\"");
		}
		
		//do the comparisons and return 1 if greater, 0 if equal, and -1 if less than
		if (this.weight > F.getWeight())
			return 1;
		else if (this.weight < F.getWeight())
			return -1;
		else
			return 0;
	}
}
