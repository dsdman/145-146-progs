/*
 * tests the stacks
 */
public class StackTester {

	public static void main(String[] args) {
		//variable
		StackInterface<Integer> stack = new LLStack<Integer>();
		
		//pushes it
		for(int i=0;i<10;i++)
		{
			stack.push(i);
		}
		
		//counts it
		System.out.println("total number of elements: "+stack.getTotalNum());
		
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
