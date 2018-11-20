import java.applet.*;
import java.awt.*;
import java.util.*;
//example of a graphics engine
public class RandomFractal extends Applet {
	//attributes
	private Image display;
	private Graphics drawingArea;
	
	//initializatoin step
	public void init()
	{
		//get the width and height
		int height = getSize().height;
		int width = getSize().width;		
		
		//construct the display to draw the graphics on
		display = createImage(width,height);
		drawingArea = display.getGraphics();
		
		//random fractal
		randomFractal(0,height/2,width,height/2,drawingArea);
	}
	
	//draws the graphics
	public void paint(Graphics g)
	{
		g.drawImage(display,0,0,null);
	}
	
	//tells it where to draws
	public static void randomFractal(int leftX, int leftY, int rightX, int rightY, Graphics drawingArea)
	{
		final int STOP = 4;//stop at 4 pixels
		final int MAX = 12;//Max range y can move in
		int midX, midY, delta;
		
		Random r = new Random();
		
		if ((rightX-leftX)<=STOP)
		{
			drawingArea.drawLine(leftX, leftY, rightX, rightY);
		}
		else
		{
			midX = (leftX + rightX)/2;
			midY = (leftY + rightY)/2;
			delta = r.nextInt(MAX);
			midY +=delta;
			randomFractal(leftX,leftY,midX,midY,drawingArea);//left side
			randomFractal(midX,midY,rightX,rightY,drawingArea);//right side
		}
		
	}
}
