/**
 * Dylan Desai and Kevin Liriani
 */
public class Apple {
  //attributes
  private String name;
  private double weight;
  private double price;
  
  //constructor
  public Apple()
  {
    this.name = "Nothing yet";
    this.weight = 0.0;
    this.price = 0.0;
  }
  //getters
  public String getName()
  {
    return this.name;
  }
  public double getWeight()
  {
    return this.weight;
  }
  public double getPrice()
  {
    return this.price;
  }
  //setters
  public void setName(String aName)
  {
    //only allow certain apples to be made
    switch (aName)
    {      
      case "Red Delicious":
      this.name = aName;
      break;
      case "Granny Smith":
      this.name = aName;
      break;
      case "Golden delicious":
      this.name = aName;
      break;
      case "Gala":
      this.name = aName;
      break;
      default:
        System.out.println("Invalid apple name");
        break;
    }
  }
  
  public void setWeight(double aWeight)
  {
    //only allow values between 0 and 2
    if (aWeight < 0 || aWeight > 2)
    {
      System.out.println("Invalid weight");
    }
    else
    {
      this.weight = aWeight;
    }
  }
  
  public void setPrice(double aPrice)
  {
    //only allow prices from 0
    if (aPrice < 0)
    {
      System.out.println("Not a valid price.");
    }
    else
    {
      this.price = aPrice;
    }
  }
  
 //other methods
  public String toString(Apple aApple)
  {
    String out = "Name " + aApple.getName() + " weight " + aApple.getWeight() + " price " + aApple.getPrice();
    return out;
  }
  public boolean equals(Apple aApple)
  {
    boolean out = this.name.equalsIgnoreCase(aApple.getName()) &&
      this.weight == aApple.getWeight() &&
      this.price == aApple.getPrice();
    return out;
  }
  
}
