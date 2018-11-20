/*
 * Written by Dylan Desai
 */
public class Item {
	//instance variables to represent position
	private int X;
	private int Y;
	
	public Item()
	{
		this.X = 0;
		this.Y = 0;
	}
	
	//getters and setters
	public int getX() {
		return X;
	}
	
	public int getY() {
		return Y;
	}
	public void setX(int x) {
		X = x;
	}

	public void setY(int y) {
		Y = y;
	}
	
	//move method for player only
	public void move(int distX, int distY)
	{
		if (this.X+distX<0 || this.Y+distY<0 || this.X+distX>9 || this.Y+distY>9)
		{
			System.out.println("Can't move out of the board.");
		}
		else
		{
			this.X += distX;
			this.Y += distY;
		}
	}	
}
