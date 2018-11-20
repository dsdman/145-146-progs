
public class ShapeTester2 {
		public static void main(String[] args)
		{
			ShapeInterface aNewShape;
			aNewShape = new ShapeBasics();
			
			//aNewShape.drawHere();
			
			//aNewShape.setOffset(5);
			//aNewShape.drawAt(7);
			
			ShapeInterface[] shapes = new ShapeInterface[10];
			shapes[0] = new Rectangle(4,5,8);
			for (int i =0; i < shapes.length; i++)
			{
				if (shapes[i] != null)
				{
					shapes[i].drawAt(10);
				}
			}
		}

}
