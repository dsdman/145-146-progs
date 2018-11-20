
public class DimensionException extends Exception {
	//default and parameterized constructors for the exception
		public DimensionException()
		{
			super("Invalid dimension. Valid values are non-zero and non-negative integers");
			
		}
		
		public DimensionException(String msg)
		{
			super(msg);
		}

}
