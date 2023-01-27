package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class BFSExample {
	public void check(int ap[]){
		ap[0]=999;
		ap[1]=888;
	}
	public static void main(String[] args) {
		
		Graph g=new Graph(8);
		g.addEdge(0, 1); 
	    g.addEdge(0, 2); 
	    g.addEdge(1, 2); 
	    g.addEdge(2, 0); 
	    g.addEdge(2, 3); 
	    g.addEdge(3, 4); 

	    g.addEdge(3, 4); 
	    g.addEdge(3, 5); 
	    g.addEdge(3, 2); 
	    g.addEdge(3, 1); 
	    g.addEdge(3, 7); 
	   // g.BFSTraverse(0);
	    BFSExample e =new BFSExample();
	    int a[]=new int[] {1,2};
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i]);
	    	a[i] = a[i] ^ 1;
	    	System.out.println("--"+a[i]);
	    	
	    }
	    e.check(a);
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i]);

	    	a[i] = a[i] ^ 1;
	    	System.out.println("--"+a[i]);
	    	
	    }

	    System.out.println("Following is Breadth First Traversal "+ 
	                       "(starting from vertex 0)"); 
	
	}
	
}
class Graph{
	
	private int v;
	private LinkedList<Integer> adj[];
	Graph(int v){
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList();
		}
		
	}
	
	void addOneEdge(int u, int v) {
		adj[u].add(v);
	}
	
	void BFS(int source) {
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		boolean visited[] = new boolean[v];
		visited[source]=true;
		while(q.size()!=0) {
			int element = q.poll();
			System.out.println(element);
			
			Iterator<Integer> itr = adj[element].listIterator();
			while(itr.hasNext()) {
				int ele = itr.next();
				if(!visited[ele]) {
					q.add(ele);
					visited[ele]=true;
				}
			}
		}
		
	}
	
	
	
	
	  void addEdge(int v,int w) 
	    { 
	        adj[v].add(w); 
	    }
	  void BFSTraverse(int source) {
		  
		  boolean visited[] = new boolean[v];
		  LinkedList<Integer> q = new LinkedList();
		  q.add(source);
		  visited[source]=true;
		  while(q.size()!=0) {
			  source = q.poll();
             System.out.print(source+" "); 
             
			  Iterator<Integer> itr = adj[source].listIterator();
			  while(itr.hasNext()) {
				 int n = itr.next();
				 if(!visited[n]) {
					 visited[n] =true;
					 q.add(n);
				 }
			  }
			  
			  
		  }	  
	  }
}
