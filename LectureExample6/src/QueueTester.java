
public class QueueTester {

	public static void main(String[] args) {
		// tests the queue structures		
		//QueueInterface<Integer> queue = new ArrayQueue<Integer>();
		QueueInterface<Integer> queue = new LLQueue<Integer>();
		for (int i =0;i<10;i++)
		{
			queue.enqueue(i);
		}
		queue.print();
		System.out.println("Removing element");
		queue.dequeue();
		queue.print();
		

	}

}
