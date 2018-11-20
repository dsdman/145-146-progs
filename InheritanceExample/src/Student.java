
public class Student extends Person {
	private int studentID;
	
	public Student()
	{
		super();//call to the constructor of the Person class base class constructor
		this.studentID = 0;
	}
	
	public Student(String aName, int anID)
	{
		super(aName);
	    //call mutator
		this.setStudentID(anID);
	}
	public int getStudentID()
	{
		return this.studentID;
	}
	public void setStudentID(int anID)
	{
		if (anID >= 0)
		{
			this.studentID = anID;
		}
	}
	public String toString()
	{
		//overrides the super class's toString
		return super.toString() + " " + this.studentID;
	}
	public boolean equals(Student aStudent)
	{
		return super.equals(aStudent) && this.studentID == aStudent.getStudentID();
		
	}

}
