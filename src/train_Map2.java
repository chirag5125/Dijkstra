//import java.util.PriorityQueue;
import java.util.*;

class arrays{
	Vertex[] array1=new Vertex[14];
	int[][] array2 = new int[14][14];
	private Hashtable<Integer, Character> trains=new Hashtable<Integer, Character>();
	
	public arrays(Vertex[] vertexList, int array2[][], Hashtable<Integer, Character> trains) {
		this.array1=vertexList;
		this.array2=array2;
		this.trains=trains;
	}
	
	public Vertex[] getArray1() {
		return array1;
	}
	public int[][] getArray2() {
		return array2;
	}
	public Hashtable<Integer, Character> getTrainTable(){
		return trains;
	}
}

class Edge{
	private int station1, sation2;
	private int weight;
	
	public Edge(int a, int b, int c) {
		this.station1=a;
		this.sation2=b;
		this.weight=c;
		}
	}
	


class Vertex{
	private String station_name;
	private boolean isPresent;
	
	public Vertex(String name) {
		this.station_name=name;
		this.isPresent=false;
	}
	//Get vertex logical name
    public String getVLogicalName() {
    	return station_name;
    	}
     
    //Get and set vIsInTheTree
    public boolean getVIsInTheTree() { 
    	return isPresent; 
    	}
    
    public void setIsInTree(boolean isInTree) {
    	this.isPresent=isInTree;
    }
    }

class Graph{
	
	Hashtable<Integer, Character> trains=new Hashtable<Integer, Character>();
	int weight;
	private int INFINITY=Integer.MAX_VALUE;
	Vertex vertexList[];		//stations in the graph
	public int adjMatrix[][];			// adjacency matrix
	
	private int nVerts;					//number of vertices
	
	public Graph(int maxV) {
		vertexList =  new Vertex[maxV];
		adjMatrix = new int[maxV][maxV];
		nVerts=0;
		
		}
	
	public void addTrainToLine(int index, char train_name) {
		trains.put(index, train_name);
	}
	
	public void addVertex(String name) {
		vertexList[nVerts++]=new Vertex(name);
	}
	
	public void addEdge(int source, int destination, int weight) {
		this.weight=weight;
		adjMatrix[source][destination]=weight;
		adjMatrix[destination][source]=weight;
	}
 	
	public void print_vertex(int vertex) {
		System.out.println(vertexList[vertex].getVLogicalName());
	}
	public int getadjMatrix(int i, int j) {
    	return adjMatrix[i][j];
    	}
	
	
}


public class train_Map2 {
	
	
	
	public arrays trainMapWeight()
	{
		
		Graph g=new Graph(14);
		//BMT Line
		
				g.addVertex("Whitehall Street–South Ferry");		//index 0
				g.addVertex("Canal Street");						//index 1
				g.addEdge(0,1,5);
				
				g.addVertex("14th Street–Union Square");			//index 2
				g.addEdge(1,2,6);
				
				g.addVertex("34th Street–Herald Square");			//index 3
				g.addEdge(2,3,5);
				
				g.addVertex("Times Square–42nd Street");			//index 4
				g.addEdge(3,4,5);
				
				g.addVertex("57th Street–Seventh Avenue");			//index 5
				g.addEdge(4,5,5);
				
				for(int i=0;i<6;i++) {
					g.addTrainToLine(i, 'R');
				}
				//IRT_line
				g.addVertex("Bowling Green");						//index 6
				g.addVertex("Wall Street");							//index 7
				g.addEdge(6,7,3);
				
				g.addVertex("Fulton Street");						//index 8
				g.addEdge(7, 8,1);
				
				g.addVertex("Brooklyn Bridge–City Hall");			//index 9
				g.addEdge(8,9,5);
				
				g.addEdge(9, 2, 6); //connects IRT and BMT lines
				
				g.addVertex("Grand Central–42nd Street");			//index 10
				g.addEdge(9, 10, 5);
				
				g.addVertex(""
						+ "");							//index 11
				g.addEdge(10, 11,9);
				
				g.addVertex("86th Street");							//index 12
				g.addEdge(11, 12,6);
				
				g.addVertex("125th Street");						//index 13
				g.addEdge(12, 13, 3);
				
				for(int i=6;i<14;i++) {
					g.addTrainToLine(i, '4');
				}
				
				//System.out.println(g.trains.get(0));
				return new arrays(g.vertexList, g.adjMatrix, g.trains);	
	}
	
}