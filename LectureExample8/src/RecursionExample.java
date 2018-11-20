/*
 * Examples of recursion in java
 */
public class RecursionExample {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	
	//recursion method of a caountDown
	public static void countDown(int number)
	{
		System.out.println(number);
		if (number <=0) //stopping condition
		{
			return;
		}
		else
		{
			countDown(number-1); //recursive call
		}
	}
	
	//recursion method of factorial
	public static int factorial(int number)
	{
		//stopping condition
		if (number<=1)
		{
			return 1;
		}
		else
		{
			//recursion call
			return number*factorial(number-1); //recursive call
		}		
	}
	
	//recursion method of GCD (greatest common denominator)
	public static int gcd(int num1, int num2)
	{
		//stopping condition
		if (num2 ==0)
			return num1;
		else
		//recursion call
			return gcd(num2,num1%num2);
	}
	
	//recursion of fibonnonci series
	public static int fiboo(int number)
	{
		if (number ==1 || number ==2)
			return 1;
		else
			return fiboo(number-1)+fiboo(number-2);
	}
}
