
public class Rectangle extends ShapeBasics implements RectangleInterface {
	private int width;
	private int height;
	
	
	public Rectangle()
	{
		super();
		this.width = 1;
		this.height = 1;
	}
	public Rectangle(int anOffset, int aW, int aH)
	{
		super(anOffset);
		this.set(aW, aH);
	}
	
	public int getWidth()
	{
		return this.width;
	}
	public int getHeight()
	{
		return this.height;
	}
	
	public void set(int aW, int aH)
	{
		if (aW > 0 && aH > 0)
		{
			this.width = aW;
			this.height = aH;
		}
	}
	
	public void drawHere()
	{
		//draw horiline
		this.drawHorizontalLine();
		// draw vertline
		this.drawVerticalLines();
		//draw hori line
		this.drawHorizontalLine();
	}
	private void drawVerticalLines()
	{
		for (int i = 0; i < this.height; i++)
		{
		skipSpaces(super.getOffset());
		System.out.print("|");
		skipSpaces(this.width -2);
		System.out.println("|");
		}
	}
	
	private void drawHorizontalLine()
	{
		skipSpaces(super.getOffset());
		for (int i = 0; i < this.width; i++)
		{
			System.out.print("_");
		}
		System.out.println();
	}

}
