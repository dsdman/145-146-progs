/*
 * Dylan Desai
 */
public class ListTester {

	public static void main(String[] args) {
		//variable
		ToDoList list = new ToDoList();
		
		//test adding item and then print the list
		System.out.println("\nTesting adding 5 items");
		for (int i=0;i<5;i++)
		{
			list.addItem("This is item: "+(i+1));
		}
		list.showList();
		
		//test inserting after current
		System.out.println("\nAfter going forward 2, insert new item after item 3");
		list.goToNext();
		list.goToNext();
		list.insertAfterCurrent("This is an item after item 3");
		list.showList();
		
		//test deletion of item 
		System.out.println("\nLet's delete this extra item now.");
		list.goToNext();
		list.deleteCurrentNode();
		list.showList();
		
		//test changing current item and going previous
		System.out.println("\nNow let's go back and change item 3");
		list.goToPrev();
		list.setDataAtCurrent("This is an altered item: 3");
		list.showList();
		
		//done
		System.out.println("\nI have now tested everything");
	}

}
