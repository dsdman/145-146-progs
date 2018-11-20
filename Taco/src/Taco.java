
public class Taco {
	private String name;
	private String location;
	private double price;
	
	public Taco()
	{
		this.name = "nothing";
		this.location = "nothing";
		this.price = 0.0;
		
	}
	public Taco(String name, String location, double price)
	{
		this.setName(name);
		this.setLocation(location);
		this.setPrice(price);
		
	}
	public String getName()
	{
		return this.name;
	}
	public String getLocation()
	{
		return this.location;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setLocation(String aLocation)
	{
		this.location = aLocation;
	}
	public void setPrice(double aPrice)
	{
		if (aPrice >= 0)
		{
			this.price = aPrice;
		}
	}
}
