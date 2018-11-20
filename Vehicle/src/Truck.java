/**
 * Dylan Desai and Jack Divers
 */
public class Truck extends Vehicle {
  //instance variables
  private double loadCapacity;
  private double towingCapacity;
  
  //constructors default and parameterized
  public Truck()
  {
    super();
    this.loadCapacity = 0;
    this.towingCapacity = 0;
  }
  public Truck(String aManuName, int aCylinders, String aName, double aLoad, double aTowing)
  {
    super(aManuName, aCylinders, aName);
    //use the setters here
    this.setLoadCapacity(aLoad);
    this.setTowingCapacity(aTowing);
  }
  
  //getters and setters
  public double getLoadCapacity()
  {
    return this.loadCapacity;
  }
  public double getTowingCapacity()
  {
    return this.towingCapacity;
  }
  public void setLoadCapacity(double aCapacity)
  {
    if (aCapacity > 0)
    {
      this.loadCapacity = aCapacity;
    }
  }
  public void setTowingCapacity(double aCapacity)
  {
    if (aCapacity > 0)
    {
      this.towingCapacity =aCapacity;
    }
  }
  
  //other methods
  public boolean equals(Truck aTruck)
  {
    return aTruck != null && super.getManuName().equalsIgnoreCase(aTruck.getManuName()) && super.getCylinders() == aTruck.getCylinders() && super.getOwnersName().equalsIgnoreCase(aTruck.getOwnersName()) && this.loadCapacity == aTruck.getLoadCapacity() && this.towingCapacity == aTruck.getTowingCapacity();
  }
  public String toString()
  {
    return super.toString() + " " + this.loadCapacity + " " + this.towingCapacity;
  }
  
}
