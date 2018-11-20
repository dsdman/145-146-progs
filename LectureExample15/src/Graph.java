/*
 * HOMEWORK: DEPTH FIRST SEARCH
 */
import java.util.*;
public class Graph {
	//vertices are nodes
	private class Vertex
	{
		//instance variables, holds name and list of edges
		String name;
		ArrayList<Edge> neighbors;
		
		//constructors
		public Vertex(String aName)
		{
			this.name = aName;
			this.neighbors = new ArrayList<Edge>();
		}
	}
	//edge class
	private class Edge
	{
		//instance variables
		Vertex toVert;
		double weight;
		
		//constructor
		public Edge(Vertex aVert, double aWeight)
		{
			this.toVert = aVert;
			this.weight = aWeight;
		}
	}
	
	//instance variables, contains origin and list of vertices
	private Vertex origin;
	private ArrayList<Vertex> vertices;
	
	//default constructor
	public Graph()
	{
		//initialize the instance variables
		origin = null;
		vertices = new ArrayList<Vertex>();
	}
	
	//adds vertices
	public void addVertex(String aName)
	{
		//don't add duplicate vertex
		for (Vertex vert: vertices)
		{
			if (vert.name.equals(aName))
			{
				return;
			}
		}
		//add it to beginning
		Vertex v = new Vertex(aName);
		if (origin ==null)
			origin = v;		
		//add it to the array list
		vertices.add(v);
	}
	
	//adds edges
	public void addEdge(String fromVert, String toVert, double weight)
	{
		//get the from and to values and verify
		Vertex v1 = getVertex(fromVert);
		Vertex v2 = getVertex(toVert);
		
		//check for null vertices
		if (v1==null || v2 ==null)
		{
			//can't add null edge
			return;
		}
		
		//make v2 the neighbor of v1
		v1.neighbors.add(new Edge(v2,weight));
	}	
	//helper for adding an edge
	private Vertex getVertex(String aName)
	{
		//if it is in there, return it
		for (Vertex vert : vertices)
		{
			if (vert.equals(aName))
				return vert;
		}
		
		//didn't find that name in any vertices
		return null; 
	}
	
	//keeps track of marked vertices for DFS
	private ArrayList<Vertex> markedVerts;
	//depth first search, prints out the paths as you travel
	public void printDFS()
	{
		if (markedVerts ==null)
		{
			markedVerts = new ArrayList<Vertex>();
		}
		else
		{
			markedVerts.clear();
		}
		//start at origin
		printDFS(origin);
	}
	//helper method for DFS
	private void printDFS(Vertex vert)
	{
		//check if verts also marked
		if (markedVerts.contains(vert))
			return;
		System.out.println(vert.name);
		//add it to the marked verts 
		markedVerts.add(vert);		
		//explore other nodes
		for (Edge edge: vert.neighbors)
		{
			printDFS(edge.toVert);
		}
	}
	
	//breadth first search
	private ArrayList<Vertex> visitedVerts;
	public void pintBFS()
	{
		//check for null lists
		if (markedVerts==null)
		{
			markedVerts = new ArrayList<Vertex>();
		}
		else
		{
			markedVerts.clear();
		}
		if (visitedVerts==null)
		{
			visitedVerts = new ArrayList<Vertex>();
		}
		else
		{
			visitedVerts.clear();
		}
		if (origin ==null)
		{
			return;
		}
		//print the origin
		System.out.println(origin.name);
		
		//recursive call
		printBFS(origin);		
	}
	private void printBFS(Vertex vert)
	{
		if (markedVerts.contains(vert))
			return;
		//mark the vertex
		markedVerts.add(vert);
		
		//visit the neighbors
		for (Edge edge : vert.neighbors)
		{
			if (visitedVerts.contains(vert) || markedVerts.contains(vert))
				continue;	
			System.out.println(edge.toVert.name);
			visitedVerts.add(edge.toVert);
		}
		//travel the neighbors
		for (Edge edge : vert.neighbors)
		{
			printBFS(edge.toVert);
		}
	}
}























