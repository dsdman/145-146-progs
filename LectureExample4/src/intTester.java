
public class intTester {

	public static void main(String[] args) {
		/*
		 *
		 */
		IntNodeStructure list = new IntNodeStructure();
		System.out.println("Populating with 0-9");
		for (int i=0; i <10;i++)
		{
			list.insert(i);
		}
		list.print();
		System.out.println("delete the first element");
		list.deleteCurrent();
		list.print();
		System.out.println("After moving current twice and inserting 27");
		list.moveToNext();
		list.moveToNext();
		list.insertAfterCurrent(27);
		list.print();
		System.out.println("Bye 27");
		list.moveToNext();
		list.deleteCurrent();
		list.print();
	}

}
