//Dylan Desai
public class LinkedListTester {

	public static void main(String[] args) {
		//variable
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//add shit
		for (int i=0;i<10;i++)
		{
			list.insert(i);
		}
		list.printList();
		
		System.out.println();
		System.out.println();
		//delete shit
		for (int i=0;i<3;i++)
		{
			list.delete();
		}
		list.printList();
		
		System.out.println();
		System.out.println();
		//move the list, then delete
		list.goToNext();
		list.goToNext();
		list.delete();
		list.printList();
		System.out.println("The current node is: "+list.getCurrentData());
		
		//change data and go back
		System.out.println();
		System.out.println();
		list.setCurrentData(11);
		list.printList();
		list.goToPrev();
		list.goToPrev();
		System.out.println("The current node is: "+list.getCurrentData());
		
		//add after current
		System.out.println();
		System.out.println();
		list.insertAfterCurrent(15);
		list.printList();
		System.out.println("The current node is: "+list.getCurrentData());
	}

}
