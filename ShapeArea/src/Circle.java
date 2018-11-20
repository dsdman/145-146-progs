/*
 * Dylan Desai
 */
public class Circle implements Shape {
	private double radius;
	
	//constructor: default and parameterized
	public Circle()
	{
		this.radius = 1.0;
	}
	public Circle(double aR)
	{
		//use mutators
		this.setRadius(aR);
	}
	
	//getters and setters
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double aR)
	{
		if (aR > 0)
		{
			this.radius = aR;
		}
	}
	
	//other methods
	public double getArea()
	{
		double out = Math.PI * Math.pow(radius, 2);
		return out;
	}
	public String getShapeType()
	{
		return "Circle";
	}
	public String toString()
	{
		String out = this.getShapeType() + " Radius " + this.radius + " Area " + this.getArea();
		return out;
	}

}
