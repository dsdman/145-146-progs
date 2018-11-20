/**
 * Dylan Desai
 */
public class Concert {
  //variables
  private String name;
  private int capacity;
  private int phoneTicket;
  private int venueTicket;
  private double phonePrice;
  private double venuePrice;
  
  //constructors default and parameterized
  public Concert()
  {
    this.name = "No name yet";
    this.capacity = 0;
    this.phoneTicket = 0;
    this.venueTicket = 0;
    this.phonePrice = 0.0;
    this.venuePrice = 0.0;
  }
  public Concert(String aName, int aCapacity, double aPhonePrice, double aVenuePrice)
  {
    //use the setters here
    this.setName(aName);
    this.setCapacity(aCapacity);
    this.setPriceByPhone(aPhonePrice);
    this.setPriceAtVenue(aVenuePrice);
  }
  public Concert(String aName, int aCapacity, int phoneNum, int venueNum, double aPhonePrice, double aVenuePrice)
  {
    //use the setters here
    this.setName(aName);
    this.setCapacity(aCapacity);
    this.setPhoneTicket(phoneNum);
    this.setVenueTicket(venueNum);
    this.setPriceByPhone(aPhonePrice);
    this.setPriceAtVenue(aVenuePrice);
  }
  
  //getters and setters
  public String getName()
  {
    return this.name;
  }
  public int getCapacity()
  {
    return this.capacity;
  }
  public int getNumberOfTicketsSoldByPhone()
  {
    return this.phoneTicket;
  }
  public int getNumberOfTicketsSoldAtVenue()
  {
    return this.venueTicket;
  }
  public double getPhonePrice()
  {
    return this.phonePrice;
  }
  public double getVenuePrice()
  {
    return this.venuePrice;
  }
  public void setName(String aName)
  {
    this.name = aName;
  }
  public void setCapacity(int aCapacity)
  {
    if (aCapacity >= 0)
    {
      this.capacity = aCapacity;
    }
  }
  public void setPhoneTicket(int phoneTickets)
  {  
    if (phoneTickets > 0)
    {
      this.phoneTicket = phoneTickets;
    }
  }
  public void setVenueTicket(int venueTickets)
  {
    if (venueTickets > 0)
    {
      this.venueTicket = venueTickets;
    }
  }
  public void setPriceByPhone(double aPhonePrice)
  {
    if (aPhonePrice > 0)
    {
      this.phonePrice = aPhonePrice;
    }
  }
  public void setPriceAtVenue(double aVenuePrice)
  {
    if (aVenuePrice > 0)
    {
      this.venuePrice = aVenuePrice;
    }
  }
  
  //other methods needed
  public int TotalNumberOfTicketsSold()
  {
    return this.phoneTicket + this.venueTicket;
  }
  public int TicketsRemaining()
  {
    return this.capacity - this.TotalNumberOfTicketsSold();      
    
  }
  public void BuyTicketsAtVenue(int numSold)
  {
    if (TicketsRemaining()>0 &&( TotalNumberOfTicketsSold() + numSold < this.capacity))
    {
    this.venueTicket += numSold;
    }
    else
    {
      System.out.println("The concert is sold out.");
    }
    
  }
  public void BuyTicketsByPhone(int numSold)
  {
    if (TicketsRemaining()>0 &&( TotalNumberOfTicketsSold() + numSold < this.capacity))
    {
    this.phoneTicket += numSold;
    }
    else
    {
      System.out.println("The concert is sold out.");
    }
    
      
  }
  public double TotalSales()
  {
    return (this.venuePrice * this.venueTicket) + (this.phonePrice * this.phoneTicket);
  }

  
}
