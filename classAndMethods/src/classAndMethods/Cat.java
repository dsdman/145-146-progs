package classAndMethods;

public class Cat {//define the class
	//Attributes / instance variables
	private String name;
	private double weight;
	private int numberofLegs;
	
	//constructors
	public Cat() //default constructors
	{
		this.name = "no name yet";
		this.weight = 1.0;
		this.numberofLegs = 4;
	}
	
	//Ascessors
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public int getNumberofLegs()
	{
		return numberofLegs;
	}
	//mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setWeight(double aWeight)
	{
		if (aWeight <= 0.0 || aWeight >= 70.0)
		{
			System.out.println("Invalid weight");
			return;
		}
		this.weight = aWeight;
	}
	public void setNumberofLegs(int aNumberofLegs)
	{
		if (aNumberofLegs < 0 || aNumberofLegs > 4)
		{
			System.out.println("Invalid number of legs");
			return;
		}
		this.numberofLegs = aNumberofLegs;
	}
	//other methods
	public boolean equals(Cat aCat)
	{
		return this.name.equals(aCat.getName()) &&
				this.weight == aCat.getWeight() &&
				this.numberofLegs == aCat.getNumberofLegs();
	}

}
