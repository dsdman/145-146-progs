
public class ShapeBasics implements ShapeInterface {
		private int offset;
		
		public ShapeBasics()
		{
			this.offset = 0;
		}
		public ShapeBasics(int anOffset)
		{
			//use mutators
			this.setOffset(anOffset);
		}
		
		public int getOffset()
		{
			return this.offset;
		}
		public void setOffset(int anOffset)
		{
			if (anOffset >=0)
			{
				this.offset = anOffset;
			}
		}
		
		public void drawAt(int lineNumber)
		{
			for (int i = 0; i < lineNumber; i++)
			{
				System.out.println();
			}
			//draw here
			this.drawHere();
		}
		public void drawHere()
		{
			/*
			for (int i = 0; i < this.offset; i++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
			*/
			skipSpaces(this.offset);
			System.out.println("*");
		}
		public static void skipSpaces(int numSpaces)
		{
			for (int i = 0; i < numSpaces;i++)
			{
				System.out.print(" ");
			}
		}

}
