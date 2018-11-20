
public class ShapeTester {
	public static void main(String[] args)
	{
        //filling up the collection with things
		ShapeInterface[] shapes = new ShapeInterface[5];
		shapes[0] = new ShapeBasics();
		shapes[1] = new Rectangle(4,5,6);
		shapes[2] = new ShapeBasics(1);
		shapes[3] = new Rectangle(3,4,5);
		shapes[4] = new ShapeBasics(5);
		
        //draw the shapes from the array
		for (int i = 0; i < shapes.length; i++)
		{
			shapes[i].drawHere();
		}
	}

}
