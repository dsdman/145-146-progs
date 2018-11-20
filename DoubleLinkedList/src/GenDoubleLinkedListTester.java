/*
 * Written by Dylan Desai
 */
public class GenDoubleLinkedListTester {

	public static void main(String[] args) {
		//variables and greeting
		GenDoubleLinkedList<Integer> testInt = new GenDoubleLinkedList<Integer>();
		GenDoubleLinkedList<String> testString = new GenDoubleLinkedList<String>();
		System.out.println("This is the tester for the generic doubly linked list. Using Strings and integers here.");
		
		/*
		 * TESTS FOR THE INTEGER LIST
		 */
		
		//test 1: going forward and adding data
		System.out.println("\nAdding 5 numbers and moving forward in the list.");
		
		for (int i=0;i<5;i++)
		{
			testInt.insertAfterCurrent(i+1);
			testInt.goToNext();
		}
		testInt.showList();
		
		//test 2: going backward and deleting data
		System.out.println("\nGoing back two and deleting the number 3.");
		testInt.goToPrev();
		testInt.goToPrev();
		testInt.deleteCurrentNode();
		testInt.showList();
		
		//test 3: getting and setting current data
		System.out.println("\nPrinting current data (should be 4) and changing it to zero");
		System.out.println("The current is: " +testInt.getDataAtCurrent());
		testInt.setDataAtCurrent(0);
		testInt.showList();
		
		//test 4: checking if data is in list
		System.out.println("\n2 should be in the list");
		if (testInt.inList(2))
		{
			System.out.println("2 is in the list.");
		}
		System.out.println("\nBut 3 isn't in the list");
		if (testInt.inList(3))
		{
			System.out.println("3 is in the list.");
		}
		else
		{
			System.out.println("3 is not in the list");
		}
		System.out.println("\nI've tested everything.\nNow testing strings.");
		
		/*
		 * TESTS FOR THE STRING LIST
		 */
		
		//test 1: going forward and adding data
		System.out.println("\nAdding 5 strings and moving forward in the list.");
		
		for (int i=0;i<5;i++)
		{
			testString.insertAfterCurrent("This is string: "+(i+1));
			testString.goToNext();
		}
		testString.showList();
		
		//test 2: going backward and deleting data
		System.out.println("\nGoing back two and deleting string 3.");
		testString.goToPrev();
		testString.goToPrev();
		testString.deleteCurrentNode();
		testString.showList();
		
		//test 3: getting and setting current data
		System.out.println("\nPrinting current data (should be String 4) and changing it to something else");
		System.out.println("The current is: " +testString.getDataAtCurrent());
		testString.setDataAtCurrent("This is an altered string 4");
		testString.showList();
		
		//test 4: checking if data is in list
		System.out.println("\nString 2 should be in the list");
		if (testString.inList("This is string: 2"))
		{
			System.out.println("String 2 is in the list.");
		}
		System.out.println("\nBut String 3 isn't in the list");
		if (testString.inList("This is string: 3"))
		{
			System.out.println("String 3 is in the list.");
		}
		else
		{
			System.out.println("String 3 is not in the list");
		}
		System.out.println("\nI've tested everything.Goodbye.");
		
		
	}

}
