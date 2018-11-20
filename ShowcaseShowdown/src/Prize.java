/*
 * Written by Dylan Desai
 */
public class Prize {
	//instance variables
	private String name;
	private int price;
	
	//constructors, default and parametrized
	public Prize()
	{
		this.name = "Nothing";
		this.price = 0;
	}
	public Prize(String aName, int aPrice)
	{
		this.setName(aName);
		this.setPrice(aPrice);
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		this.name = aName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int aPrice) {
		if (aPrice >=0)
		this.price = aPrice;
	}
	
}

