/*
 * Dylan Desai
 */
package sortingLaundry;
//enumerations for the type and color
enum Type {Undergarmet, Socks, Stockings, Top, Bottom, Cape};
enum Color {Brown, Red, Pink, Orange, Green, Blue, Purple, Grey};

public class Clothing {
	private Type clothesType;
	private Color clothesColor;
	
	//constructor: default and parameterized
	public Clothing()
	{
		this.clothesType = Type.Bottom;
		this.clothesColor = Color.Grey;
	}
	public Clothing(Type aClothesType, Color AClothesColor)
	{
		//use mutators
		this.setColor(AClothesColor);
		this.setType(aClothesType);
	}
	
	//getters
	public Type getType()
	{
		return this.clothesType;
	}
	public Color getColor()
	{
		return this.clothesColor;
	}
	
	//setters: Since I used enums, there is nothing to check for
	public void setType(Type aClothesType)
	{
		this.clothesType = aClothesType;
	}
	public void setColor(Color aClothesColor)
	{
		this.clothesColor = aClothesColor;
	}
	
	//methods
	public String toString()
	{
		return this.clothesType + " " + this.clothesColor;
	}
	public boolean equals(Clothing aClothing)
	{
		return aClothing != null && this.clothesColor == aClothing.getColor() && this.clothesType == aClothing.getType();
		
	}
}
