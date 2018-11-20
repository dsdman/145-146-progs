/*
 * Yet another example of recursion and graphics
 */
import java.applet.*; //created for window
import java.awt.*; //used for drawing
import java.util.*; //useful utilities

public class SierpinskiSponge extends Applet {
	private Image display; //put inside of window
	private Graphics drawingArea; //draws the item
	
	//the overridden of iniitalization called by Applet
	public void init()
	{
		//get the height and width
		int height = getSize().height;
		int width  = getSize().width;
		
		//initialize the display and drawing area
		display = createImage(width,height);
		drawingArea = display.getGraphics();
		
		//draw gasket
		drawGasket(0,0,width,drawingArea);
	}
	
	//another method called by Applet to draw the thing
	public void paint(Graphics g)
	{
		g.drawImage(display, 0, 0, null);
	}
	
	//makes the shape
	public void drawGasket(int x, int y, int side, Graphics g)
	{
		//used to divide the side by three to draw the smaller squares
		int sub = side/3;
		//draw a square (the middle one)
		g.fillRect(x+sub, y+sub, sub, sub);
		
		//halting condition
		if (sub >=3) //if this is not true, square is too small
		{
			//top 3 squares
			drawGasket(x,y,sub,g); //left
			drawGasket(x+sub,y,sub,g); // mid
			drawGasket(x+sub*2,y,sub,g); //right
			
			//middle 2 squares
			drawGasket(x,y+sub,sub,g); //left
			drawGasket(x+sub*2,y+sub,sub,g); //right
			
			//bottom squares
			drawGasket(x,y+2*sub,sub,g); //left
			drawGasket(x+sub,y+sub*2,sub,g);//mid
			drawGasket(x+sub*2,y+sub*2,sub,g);//Right
		}
		
		/*
		 * HOMEWORK HELP!!!!!!!!!
		 */
		
		//*********************************************************************************
		//g.fillPolygon(xPoints, yPoints, nPoints); USE THIS FOR YOUR HOMEWORK!!!!!!!!!!!!1
		//*********************************************************************************
		
		//ALGORITHM:
		
		/*
		 * init
		 */
		//step 1: draw big triangle (three points, mid top, and two bottom corners
		//step 2: change colors (set setColor method)
		
		/*
		 *RECURSION PART 
		 */
		//three points for inner triangle (one mid left length, one mid right length, and top mid)
		//step 3: calculate above three points
		   //1: x + 1/4xSide, y+1/2xSide
		   //2: x + 1/2xSide, y+ Side
		   //3: x + 3/4xSide, y+1/2xSide
		//step 4: draw it!
		//step 5: call recursive three times, calculate the origins of the other three squares
	}	
}
