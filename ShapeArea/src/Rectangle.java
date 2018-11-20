
public class Rectangle implements Shape {
	private double length;
	private double height;
	
	//constructor: default and parameterized
	public Rectangle()
	{
		this.length = 1.0;
		this.height = 1.0;
	}
	public Rectangle(double aL, double aH)
	{
		//use mutators
		this.setLength(aL);
		this.setHeight(aH);
	}
	
	//getters and setters
	public double getLength()
	{
		return this.length;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setLength(double aL)
	{
		if (aL > 0)
		{
				this.length = aL;
		}
	}
	public void setHeight(double aH)
	{
		if (aH > 0)
		{
			this.height = aH;
		}
	}
	
	//other methods
	public double getArea()
	{
		return this.height*this.length;
	}
	public String getShapeType()
	{
		return "Rectangle";
	}
	public String toString()
	{
		String out = this.getShapeType() + " Length " + this.length + " Height " + this.height + " Area " + this.getArea();
		return out;
	}

}
