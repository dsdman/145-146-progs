/*
 * Written by Dylan Desai
 */
public class Process implements Comparable {
	//instance variables
	private int priority;
	private int time;
	private String name;
	
	//constructors
	public Process()
	{
		this.priority = 0;
		this.time = 0;
		this.name = "nothing";
	}
	public Process(String aName, int aPriority, int aTime)
	{
		//USE SETTERS
		this.setPriority(aPriority);
		this.setTime(aTime);
		this.setName(aName);
	}
	
	//getters and setters
	public int getPriority() {
		return this.priority;
	}
	public void setPriority(int priority) {
		if (priority >0)
			this.priority = priority;
	}
	public int getTime() {
		return this.time;
	}
	public void setTime(int time) {
		if (time >0)
			this.time = time;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//toString method
	public String toString()
	{
		return this.name + " " + this.priority + " " + this.time;
	}
	
	//compareTo method
	public int compareTo(Object a)
	{
		//variable to compare
		Process compare = (Process)a;
		
		//do compares
		if (this.priority > compare.getPriority())
			return 1;
		else if (this.priority < compare.getPriority())
			return -1;
		else
			return 0;		
	}
	
	//equals method
	public boolean equals(Process aProcess)
	{
		return aProcess!=null && this.name.equals(aProcess.getName()) && this.priority == aProcess.getPriority() && this.time == aProcess.getTime(); 
	}
}
