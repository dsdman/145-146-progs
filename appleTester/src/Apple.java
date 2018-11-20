//Dylan Desai
public class Apple {
	//attriutes
	private String name;
	private double weight;
	private double price;
	//constructor
	public Apple()
	{
		this.name = "blank for now";
		this.weight = 0.0;
		this.price = 0.0;
	}
	//accessors
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getPrice()
	{
		return this.price;
	}
	//setters
	public void setName(String aName)
	{
		//only accept certain values
		if (aName.equalsIgnoreCase("red delicious"))
		{
			this.name = aName;
		}
		else if (aName.equalsIgnoreCase("granny smith"))
		{
			this.name = aName;
		}
		else if (aName.equalsIgnoreCase("gala"))
		{
			this.name = aName;
		}
		else if (aName.equalsIgnoreCase("golden delicious"))
		{
			this.name = aName;
		}
		else
		{
			System.out.println("Invalid name");
		}
	}
	public void setWeight(double aWeight)
	{
		//only accept values between 0 and 2kg
		if (aWeight < 0.0 || aWeight > 2.0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			this.weight = aWeight;
		}
	}
	public void setPrice(double aPrice)
	{
		//only accept positive values
		if (aPrice <0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			this.price = aPrice;
		}
	}
	//methods
	public boolean equals(Apple aApple)
	{
		return this.name.equals(aApple.getName()) &&
				this.weight == aApple.getWeight() &&
				this.price == aApple.getPrice();
	}
	public String toString(Apple aApple)
	{
		String out = "Name: " + aApple.getName() + " Weight: " + aApple.getWeight() + " Price: " + aApple.getPrice();
		return out;
	}
	
}
