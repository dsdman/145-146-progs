/**
 * Dylan Desai
 * Lab exam 2 from: https://cse.sc.edu/~shephejj/csce145/Labs/LabExam2SecretSecret.html
 */
public class Space {
  //instance variables
  private boolean hasBeenUncovered;
  private boolean isSecretSquare;
  
  //constructrs: default and parameterized
  public Space()
  {
    this.hasBeenUncovered = false;
    this.isSecretSquare = false;
  }
  public Space(boolean bool1, boolean bool2)
  {
    //use the mutators here
    this.setHasBeenUncovered(bool1);
    this.setIsSecretSquare(bool2);
  }
  
  //getters and setters
  public boolean getHasBeenUncovered()
  {
    return this.hasBeenUncovered;
  }
  public boolean getIsSecretSquare()
  {
    return this.isSecretSquare;
  }
  public void setHasBeenUncovered(boolean bool1)
  {
    this.hasBeenUncovered = bool1;
  }
  public void setIsSecretSquare(boolean bool2)
  {
    this.isSecretSquare = bool2;
  }
  
  //other methods
  public String toString()
  {
    if (this.hasBeenUncovered)
    {
      return "#";
    }
    else
    {
      return "_";
    }
  }
  
  
}
