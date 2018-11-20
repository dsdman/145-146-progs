/*
 * array implementaiton of a stack
 */
public class ArrayStack<T> implements StackInterface {
	//instance variables
	private T [] stack;
	public static int DEFAULT_SIZE = 50;
	private int head;
	
	//constructors and initialize
	public ArrayStack()
	{
		this.initialize(DEFAULT_SIZE);
	}
	public ArrayStack(int size)
	{
		this.initialize(size);
	}
	
	public void initialize(int size)
	{
		if (size <=0)
			return;
		head = 0;
		stack = (T[]) (new Object[size]);
	}
	
	//adding (push) something to stack
	public void push(Object data)
	{
		if (head >= stack.length) //check if full
		{
			System.out.println("Stack is full");
			return;
		}
		stack[head] = (T)data;
		head++;
		
	}
	
	//removing (pop) something to stack and return data
	public T pop()
	{
		if (head ==0)
		{
			System.out.println("Empty stack");
			return null;
		}
		T retVal = stack[head-1]; //temporary value
		head--;
		return retVal;
	}
	
	//just returns data at head
	public T peek()
	{
		if (head >0)
		{
			return stack[head-1];
		}
		else
		{
			return null;
		}
		
	}
	
	//prints the stack
	public void print()
	{
		for (int i=head-1;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}
	@Override
	public int getTotalNum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
