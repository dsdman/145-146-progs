/*
 * Dylan Desai
 */
public class Triangle implements Shape {
	private double base;
	private double height;
	
	//constructor default and parameterized
	public Triangle()
	{
		this.base = 1.0;
		this.height = 1.0;
	}
	public Triangle(double aB, double aH)
	{
		//use mutators
		this.setBase(aB);
		this.setHeight(aH);
	}
	
	//getters and setters
	public double getBase()
	{
		return this.base;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setBase(double aB)
	{
		if (aB > 0)
		{
			this.base = aB;
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
		double out = (1.0 / 2.0) * this.base * this.height;
		return out;
	}
	public String getShapeType()
	{
		return "Triangle";
	}
	public String toString()
	{
		String out  = this.getShapeType() + " Base " + this.base + " Height " + this.height + " Area " + this.getArea();
		return out;
		
	}

}
