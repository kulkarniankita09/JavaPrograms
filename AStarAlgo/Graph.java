package assignment;
import java.util.HashMap;
// DO NOT EDIT THIS FILE
public class Graph {
	
	
	/*
	 * A graph is represented using a map that associates nodes with Arcs.
	 * 
	 * Arcs are objects of the Arc class, while nodes are just represented
	 * as integers.
	 */
	
	
	private HashMap<Integer, Arc[]> hm = new HashMap<Integer, Arc[]>();
	
	
	// add a node and all Arcs from the node.
	public void add(int node, Arc[] arcs)
	{
		hm.put(node, arcs);
	}
	
	// returns all the Arcs from a given node in the graph
	public Arc[] getArcs(int fromNode)
	{
		return (Arc[]) hm.get(fromNode);
	}
}

