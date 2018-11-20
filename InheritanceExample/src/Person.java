
public class Person {
	private String name;
	
	public Person()
	{
		this.name = "No name yet";
	}
	public Person(String aName)
	{
		//call mutator
		this.setName(aName);
	}
	public String getName()
	{
		return this.getName();
	}
	public void setName(String aName)
	{
		this.name = aName;
	}
	public String toString()
	{
		return this.name;
	}
	public boolean equals(Person aPerson)
	{
		return this.name.equals(aPerson.getName());
	}
}
