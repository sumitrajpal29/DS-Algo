import java.util.*;

public class Graph{
    static int V;
    static LinkedList<Integer> adj[];
    
    Graph(int v){
        V=v;
        adj=new LinkedList[v];      //<Integer>
        for(int i=0; i<v; i++)
        adj[i]=new LinkedList();    //<Integer>
    }
    
    static void addEdge(int a, int b){
        adj[a].add(b);
        adj[b].add(a);
    }
    
    static void DFS(int v){
        boolean visited[]=new boolean[V];
        DFS(v, visited);
    }
    static void DFS(int v, boolean[] visited){
        visited[v]=true;
        System.out.println(v);
        
        Iterator<Integer> i=adj[v].listIterator();
        while(i.hasNext()){
            int n=i.next();
            if(!visited[n])
            DFS(n,visited);
        }
    }
    
    public static void main(String sumit[]){
        Graph g=new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(0,2);
        g.addEdge(0,3);
        
        g.DFS(1);
    }
}
