/*
 * HOMEWORK HELP
 * start from face (picture)
 * MAKE SURE TO NOT GO OUT OF BOUNDS
 * CALL THE DFS 8 times
 * IMPLEMENT THE LENGTH RESTRICTION
 * 	CHECK FOR THE STRING AFTER 5 TIMES
 */


/*
 * MORE HOMEWORK HELP
 * 
 */
import java.util.*;

public class AdjMatrixGraph {
	//setup the matrix
	private double[][] adjMatrix;
	public static final int DEFAULT_SIZE =10;
	private ArrayList<Integer> markedVerts;
	private ArrayList<Integer> visitedVerts;
	
	//constructor
	public AdjMatrixGraph()
	{
		adjMatrix = new double[DEFAULT_SIZE][DEFAULT_SIZE];
		this.init();
	}
	public AdjMatrixGraph(int size)
	{
		if (size<=0)
			return;
		adjMatrix = new double[size][size];
		this.init();
	}
	//initialization
	private void init()
	{
		for (int i=0;i<adjMatrix.length;i++)
		{
			for (int j=0;j<adjMatrix[i].length;j++)
			{
				adjMatrix[i][j] = 0.0;
			}
		}
		
		markedVerts = new ArrayList<Integer>();
		visitedVerts = new ArrayList<Integer>();
	}
	
	//adding edges
	public void addEdge(int toVertex, int fromVertex, double weight)	
	{
		//check for invalid values
		if (toVertex <0 || fromVertex <0 || toVertex >=adjMatrix.length || fromVertex >=adjMatrix.length)
			return;
		
		//add the edge
		adjMatrix[fromVertex][toVertex] = weight;
		
		//from = row, to=column or [column][row]
	}
	
	//depth first search
	public void printDFS()
	{
		//start from empty marked list
		markedVerts.clear();
		
		//call a recursive method
		printDFS(0);
	}
	private void printDFS(int index)
	{
		//print the index and add it to the marked list
		System.out.println(index);
		markedVerts.add(index);
		
		//search for non-zero value and contine searching there
		for (int i=0;i<adjMatrix[index].length;i++)
		{
			//if it is in the thing and not in marked list
			if (adjMatrix[index][i] !=0 && markedVerts.contains(i)==false)
			{
				printDFS(i);
			}
		}
	}
	
	//breadth first search
	public void printBFS()
	{
		//clear lists
		markedVerts.clear();
		visitedVerts.clear();
		
		//call recursive
		printBFS(0);
	}
	private void printBFS(int index)
	{
		//add the vertex to visited
		if (visitedVerts.contains(index)==false)
		{
			System.out.println(index);
			visitedVerts.add(index);
		}
		//add it to the marked list
		markedVerts.add(index);
		//add to visited if nonzero
		for (int i=0;i<adjMatrix[index].length;i++)
		{
			if (adjMatrix[index][i]!=0 && visitedVerts.contains(i)==false)
			{
				System.out.println(i);
				visitedVerts.add(i);
			}
		}
		//continue search if nonzero
		for (int i=0;i<adjMatrix[index].length;i++)
		{
			if (adjMatrix[index][i] !=0 && markedVerts.contains(i)==false)
				printBFS(i);
		}
	}
}