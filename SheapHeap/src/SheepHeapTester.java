/*
 * Written by Dylan Desai
 */
public class SheepHeapTester {

	public static void main(String[] args) {
		//variables
		SheepHeap heap = new SheepHeap();
		Sheep[] sortHeap = new Sheep[heap.getLength()];
		
		//greeting and test adding sheep
		System.out.println("This is a sheep heap tester.\n\nAdding 15 sheep to the heap and printing roll call");
		heap.addSheep(new Sheep("CantComeUpWithName",1));
		heap.addSheep(new Sheep("CantComeUpWithName",2));
		heap.addSheep(new Sheep("CantComeUpWithName",3));
		heap.addSheep(new Sheep("CantComeUpWithName",6));
		heap.addSheep(new Sheep("CantComeUpWithName",9));
		heap.addSheep(new Sheep("CantComeUpWithName",5));
		heap.addSheep(new Sheep("CantComeUpWithName",10));
		heap.addSheep(new Sheep("CantComeUpWithName",14));
		heap.addSheep(new Sheep("CantComeUpWithName",8));
		heap.addSheep(new Sheep("CantComeUpWithName",17));
		heap.addSheep(new Sheep("CantComeUpWithName",21));
		heap.addSheep(new Sheep("CantComeUpWithName",4));
		heap.addSheep(new Sheep("CantComeUpWithName",19));
		heap.addSheep(new Sheep("CantComeUpWithName",7));
		heap.addSheep(new Sheep("CantComeUpWithName",11));
		heap.sheepRollCall();
		
		//test removing sheep
		System.out.println("\nRemoving three sheep from the heap and printing roll call");
		for (int i=0;i<3;i++)
		{
			heap.removeSheep();
		}
		heap.sheepRollCall();
		
		//test returning sorted array of sheep
		System.out.println("\nGetting and printing a sorted array of sheep.");
		sortHeap = heap.sheepHeapSort();
		for (Sheep data: sortHeap)
			System.out.println(data);
		
		//done
		System.out.println("\nEverything has been tested. Goodbye.");
	}

}
