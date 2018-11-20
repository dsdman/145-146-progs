
public class Undergrad extends Student {
	private int level;
	public Undergrad()
	{
		super();
		this.level = 0;
	}
	public Undergrad(String aName, int anID, int aLevel)
	{
		super(aName, anID);
		this.setLevel(aLevel);
	}
	public int getLevel()
	{
		return this.level;
	}
	public void setLevel(int aLevel)
	{
		if (aLevel >=0 && aLevel <= 4)
		{
			this.level = aLevel;
		}
	}
}
