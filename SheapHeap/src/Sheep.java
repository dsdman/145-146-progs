/*
 * written by Dylan Desai
 */
public class Sheep implements Comparable {
	//instance variables
	private String name;
	private double weight;
	
	//constructors
	public Sheep()
	{
		this.name = "someSheep";
		this.weight = 0.0;
	}
	public Sheep(String name, double weight)
	{
		this.setName(name);
		this.setWeight(weight);
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight >0)
			this.weight = weight;
	}
	
	//compareTo method
	public int compareTo(Object sheep) {
		//thing to compare to
		Sheep comparable = new Sheep();
		
		//type cast object to sheep
		try
		{
			comparable = (Sheep)sheep;
		}
		catch (Exception e)
		{
			System.out.println("Object must be of type \"Sheep\"");
		}
		
		//do comparisons
		if (this.weight > comparable.getWeight())
			return 1;
		else if (this.weight < comparable.getWeight())
			return -1;
		else
			return 0;
	}
	
	//equals method
	public boolean equals(Sheep aSheep)
	{
		return aSheep !=null && this.name.equals(aSheep.getName()) && this.weight == aSheep.getWeight();
	}
	
	//toString method
	public String toString()
	{
		return this.name + " " + this.weight;
	}
}
