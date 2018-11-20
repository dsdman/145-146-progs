//Dylan Desai
public class Employee extends SimplePerson {
	private String hireDate;
	private int idNum;
	private double salary;
	
	//constructors: default and parameterized
	public Employee()
	{
		super();
		this.hireDate = "Not hired";
		this.salary = 0.0;
		this.idNum = 0;
	}
	public Employee(String aName, double aSalary, String aDate, int anID)
	{
		super(aName);
		//use mutators
		this.setSalary(aSalary);
		this.setHireDate(aDate);
		this.setIdNum(anID);
	}
	
	//getters and setters
	public String getHireDate()
	{
		return this.hireDate;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public int getIdNum()
	{
		return this.idNum;
	}
	public void setHireDate(String aDate)
	{
		this.hireDate = aDate;
	}
	public void setSalary(double aSalary)
	{
		this.salary = aSalary;
	}
	public void setIdNum(int anID)
	{
		if (anID >=0 && anID <10)
		this.idNum = anID;
		else
		System.out.println("Invalid ID");
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Makes " + this.salary + "\n" + "Was hired " + this.hireDate + "\n" + "ID number is " + this.idNum);
	}
	public boolean equals(Employee anEmployee)
	{
		return anEmployee !=null && super.equals(anEmployee) && this.hireDate.equals(anEmployee.getHireDate()) && this.salary == anEmployee.getSalary() && this.idNum == anEmployee.getIdNum();
	}
}
