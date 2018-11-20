/**
 * Auto Generated Java Class.
 */
public class Diamond extends ShapeBasics implements DiamondInterface {
  private int width;
  
  //constructor default and parameterized
  public Diamond()
  {
    super();
    this.width = 0;
  }
  public Diamond(int aWidth, int anOffset)
  {
    super(anOffset);
    this.setWidth(aWidth);
    
  }
  
  //getters and setters
  public int getWidth()
  {
    return this.width;
  }
  public void setWidth(int aWidth)
  {
    if (aWidth % 2 == 1 && aWidth > 0)
    {
      this.width = aWidth;
    }
  }
  
  //static skipSpaces method
  public static void skipSpaces(int aNumOfSpaces)
  {
    for (int i = 0; i < aNumOfSpaces; i++)
    {
      System.out.print(" ");
    }
  }
  
  //The draw methods
  private void drawTopV()
  {   
    //start by drawing the first star
    int spaces = getOffset() + (width/2);
    int spaces2 = getOffset();
    Diamond.skipSpaces(spaces);
    System.out.print("*");
    System.out.println();
    for (int i = 0; i < 1; i++)
    {
      for (int j = 0; j < (width-1) / 2; j++)
      {
        spaces-=1;
        Diamond.skipSpaces(spaces);
        System.out.print("*");
        Diamond.skipSpaces(spaces2);
        System.out.print("*");
        spaces2 +=2;
        System.out.println();
      }
      
    }
    
  }
  private void drawBottomV()
  {
    int spaces = getOffset();
    int spaces2 = getOffset() + (width /2) -1;
    for (int i = 0; i < 1; i++)
    {
      for (int j = 0; j < ((width -1) /2) -1; j++)
      {
        spaces +=1;
        Diamond.skipSpaces(spaces);
        System.out.print("*");
        Diamond.skipSpaces(spaces2);
        System.out.print("*");
        spaces2 -=2;
        System.out.println();
        
      }
    }
    spaces = getOffset() + (width /2);
    Diamond.skipSpaces(spaces);
    System.out.print("*");
    System.out.println();
    
  }
  public void drawHere()
  {
    //draw the top, and then the bottom
    this.drawTopV();
    this.drawBottomV();
  }
  
  
  
  
}
