/*
 * tests the stacks
 */
public class StackTester {

	public static void main(String[] args) {
		//variable
		Stack<Integer> stack = new Stack<Integer>();
		
		//pushes it
		for(int i=0;i<10;i++)
		{
			stack.push(i);
		}
		
		//pops it
		for (int i=0;i<10;i++)
		{
			System.out.println(stack.pop());
		}
		
		//peek it
		stack.push(5);
		System.out.println(stack.peek());
		
		//print it
		stack.print();

	}

}
