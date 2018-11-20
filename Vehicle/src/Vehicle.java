/**
 * Dylan Desai and Jack Divers
 */
public class Vehicle {
  //instance variables
  private String manuName;
  private int cylinders;
  private String ownersName;
  
  //constructors default and parameterized
  public Vehicle()
  {
   this.manuName = "Toyota";
   this.cylinders = 1;
   this.ownersName = "Bob";
  }
  public Vehicle (String aManuName, int aCylinders, String aName)
  {
    //use the setters
    this.setManuName(aManuName);
    this.setCylinders(aCylinders);
    this.setOwnersName(aName);
  }
  
  //getters and setters
  public String getManuName()
  {
    return this.manuName;
  }
  public int getCylinders()
  {
    return this.cylinders;
  }
  public String getOwnersName()
  {
    return this.ownersName;
  }
  public void setManuName(String aName)
  {
    this.manuName = aName;
  }
  public void setCylinders(int aCylinders)
  {
    if (aCylinders > 0)
    {
      this.cylinders = aCylinders;
    }
  }
  public void setOwnersName(String aName)
  {
    this.ownersName = aName;
  }
  
  //other methods
  public boolean equals(Vehicle aVehicle)
  {
    return aVehicle != null && this.manuName.equalsIgnoreCase(aVehicle.getManuName()) && this.cylinders == aVehicle.getCylinders() && this.ownersName.equalsIgnoreCase(aVehicle.getOwnersName());
  }
  public String toString()
  {
    return this.manuName + " " + this.cylinders + " " + this.ownersName;
  }
  
}
