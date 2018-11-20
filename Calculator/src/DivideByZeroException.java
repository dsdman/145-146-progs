
public class DivideByZeroException extends Exception {
	public DivideByZeroException()
	{
		super("tried to divide by zero");
	}
	public DivideByZeroException(String msg)
	{
		super(msg);
	}
	
	/* TO THROW THIS EXCEPTION
	
	1. USE RESERVE WORD THROWS DivideByZeroException()
	2. throw new DivideByZeroException();
	3. add throws DivideByZeroException to the parameters when needed
	4. Use the exception where it needs to be inside of try catch block
	
	*/
}
