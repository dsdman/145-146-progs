/*
 * Dylan Desai
 */
public class ShapeCollection {
	private Shape[] shapes;
	
	//default constructor
	public ShapeCollection()
	{
		shapes = new Shape[10];
	}
	
	//methods
	public void addShape(Shape aShape)
	{
		//determines the index to put the Shape in
		int x = 0;
		for (int i = shapes.length - 1; i >=0; i--)
		{
			if (shapes[i] == null)
			{
				x = i;
			}
		}
		//makes shapes at x equal to the parameter
		shapes[x] = aShape;
	}
	public void removeShape(String aShapeType, double anArea)
	{
		boolean removed = false; //boolean to be used so only one element is removed
				
		//searches for a shape that matches parameter and removes it by making it null
		for (int i = 0; i < shapes.length && !removed; i++)
		{
			if (shapes[i] != null && shapes[i].getShapeType().equals(aShapeType) && shapes[i].getArea() == anArea)
			{
				shapes[i] = null;
				removed = true;
			}
		}
	}
	public void printShapes()
	{
		//sort the shapes
		this.sortShapes();
		
		//prints array through a for loop
		for (int i = 0; i < shapes.length; i++)
		{
			if (shapes[i] != null)
			{
				System.out.println(shapes[i].toString());
			}
			
		}
	}
	private void sortShapes()
	{
		boolean sort = true; //boolean to stop the sort loop
		Shape temp; //holds old value in array
		
		while (sort)
		{
			sort = false;
			for (int i = 0; i < shapes.length; i++)
			{
				if (shapes[i] != null && shapes[i+1] !=null && shapes[i].getArea() > shapes[i +1].getArea())
				{
					temp = shapes[i]; //store the value of the smaller shape
					shapes[i] = shapes[i + 1]; //swap smaller shape with bigger one
					shapes[i + 1] = temp; //swap the bigger shape with the smaller one
					sort = true; //keep running the loop
				}
			}
		}
	}
	
	

}
