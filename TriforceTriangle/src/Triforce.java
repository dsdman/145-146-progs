/*
 * Written by Dylan Desai
 */
import java.applet.*;
import java.awt.*;
import java.util.*;
public class Triforce extends Applet {
	//instance variables for drawing
	private Image display; //used for window
	private Graphics drawingArea; //used for drawing
	
	//init method
	public void init()
	{
		//get the width and height
		int height = getSize().height;
		int width = getSize().width;
		
		//initialize display and drawing area
		display = createImage(width,height);
		drawingArea = display.getGraphics();
		
		//draw triforce
		drawTriforce(0,0,width,drawingArea,true);
	}
	
	//method called by Applet to help draw the thing
	public void paint (Graphics g)
	{
		g.drawImage(display, 0, 0, null);
	}
	
	//makes the shape
	public void drawTriforce(int x	, int y, int side, Graphics g, boolean isFirst)
	{
		//variables 
		final int STOP = 4;
		int[] X = new int[3];
		int[] Y = new int[3];
		int division = side/4; //divide by 4 for recursion so it gets smaller each time this method is called
		
		//set coordinate points for big triangle and draw it the first time
		if (isFirst)
		{
			X[0] = side/2; Y[0] = 0; 
			X[1] = 0; Y[1] = side;
			X[2] = side;Y[2] = side;
			g.setColor(Color.YELLOW);
			g.fillPolygon(X, Y, 3);
		}
		
		//Change color
		g.setColor(Color.WHITE);
		
		//set and draw the coordinates of the inner triangle 
		X[0] = (x+side/4); Y[0] = y+(side/2);
		X[1] = x+(side/2); Y[1] = y+side;
		X[2] = x+((side/4)*3); Y[2] = y+((side/2));
		g.fillPolygon(X, Y, 3);
		
		//use recursion for the smaller sets of triangles
		if (division >=STOP) //bigger than the limit of 4
		{
			//three recursive calls for the parts of inner triangles
			drawTriforce(x+division,y,2*division,g,false);
			drawTriforce(x+(2*division),y+(2*division),2*division,g,false);
			drawTriforce(x,y+(2*division),2*division,g,false);
		}
	}
}