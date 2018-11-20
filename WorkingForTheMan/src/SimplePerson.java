//Dylan Desai
public class SimplePerson {
	private String name;
	
	public SimplePerson()
	{
		this.name = "No name yet.";
	}
	public SimplePerson(String aName)
	{
		this.setName(aName);
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String aName)
	{
		this.name = aName;
	}
	
	public void writeOutput()
	{
		System.out.println("Name: " + this.name);
	}
	public boolean hasSameName(SimplePerson aPerson)
	{
		return aPerson!=null && this.name.equals(aPerson.getName());
	}
	public boolean equals(SimplePerson aPerson)
	{
		return aPerson!=null && this.name.equals(aPerson.getName());
	}
}
