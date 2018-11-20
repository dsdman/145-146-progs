
public class Square {
	private int length;
	public Square()
	{
		this.length = 1;
	}
	public Square(int aLength) throws DimensionException
	{
		//USE MUTATOR
		this.setLength(aLength);
	}
	public int getLength()
	{
		return this.length;
	}
	public void setLength(int aLength) throws DimensionException
	{
		//if shape is zero or negative, throw exception
		if (aLength > 0)
		{
			this.length = aLength;
		}
		else
		{
			throw new DimensionException();
		}
	}
	public void draw()
	{
		//draw square made of stars using nested for loop
		for (int i = 0; i < this.length; i++)
		{
			for (int j = 0; j < this.length; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public int getArea()
	{
		//AREA = length * length or Length ^2
		return this.length * this.length;
	}
	public int getPerimeter()
	{
		//PERIMETER = 4 * length for all non-one squares
		if (this.length != 1)
		return 4 * this.length;
		else
		return 0;
	}
}
