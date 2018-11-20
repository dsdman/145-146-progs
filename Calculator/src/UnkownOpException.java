
public class UnkownOpException extends Exception {
	public UnkownOpException()
	{
		super("Unkown operator");
	}
	public UnkownOpException(String msg)
	{
		super(msg);
	}
}
