/**
 * Dylan Desai and Jack Divers
 */
public class Car extends Vehicle {
  //instance variables
  private double gasMilage;
  private int numOfPassengers;
  
  //constructor defualt and paramterized
  public Car()
  {
    super();
    this.gasMilage = 1;
    this.numOfPassengers = 1;
  }
  public Car(String aManuName, int aCylinders, String aName, double aGasMilage, int aNumOfPassengers)
  {
    super(aManuName, aCylinders, aName);
    //use the setters
    this.setGasMilage(aGasMilage);
    this.setNumOfPassengers(aNumOfPassengers);
  }
  
  //getters and setters
  public double getGasMilage()
  {
    return this.gasMilage;
  }
  public int getNumOfPassengers()
  {
    return this.numOfPassengers;
  }
  public void setGasMilage(double aNum)
  {
    if (aNum >= 0)
    {
      this.gasMilage = aNum;
    }
  }
  public void setNumOfPassengers(int aNum)
  {
    if (aNum >= 0)
    {
      this.numOfPassengers = aNum;
    }
  }
  
  //other methods
  public boolean equals(Car aCar)
  {
    return aCar != null && super.getManuName().equalsIgnoreCase(aCar.getManuName()) && super.getCylinders() == aCar.getCylinders() && super.getOwnersName().equalsIgnoreCase(aCar.getOwnersName()) && this.numOfPassengers == aCar.getNumOfPassengers() && this.gasMilage == aCar.getGasMilage();
  }
  public String toString()
  {
     return super.toString() + " " + this.gasMilage + " " + this.numOfPassengers;
  }
  
  
  
}
