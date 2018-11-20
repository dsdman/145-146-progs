import java.util.Random;

public class BSTreeTester {

	public static void main(String[] args) {
		//Auto-generated method stub
		Random r = new Random(100);
		BSTree<Integer> bsTree = new BSTree<Integer>();
		
		for (int i =0;i<10;i++)
		{
			int insertNum = r.nextInt(100);
			System.out.println("Inserting: "+insertNum);
			bsTree.insert(insertNum);
		}
		System.out.println("In order traversal");
		bsTree.printInOrder();
		
		//bsTree.delete(66);
		System.out.println();
		System.out.println("In order traversal after deleting 66");
		bsTree.printInOrder();
	}

}
