import java.util.*;

public class Graph{
    static int V;
    static LinkedList<Integer> adj[];
    
    Graph(int v){
        V=v;
        adj=new LinkedList[v];
        
        for(int i=0; i<v; i++){
            adj[i]=new LinkedList<Integer>();
        }
    }
    
    static void addEdge(int a, int b){
        adj[a].add(b);
        adj[b].add(a);
    }
    
    static void BFS(int v){
        boolean[] visited=new boolean[V];
        
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(v);
        visited[v]=true;
        
        while(!q.isEmpty()){
            v=q.poll();
            System.out.println(v+" ");
            
            Iterator<Integer> i=adj[v].listIterator();
            while(i.hasNext()){
                int n=i.next();
                
                if(!visited[n]){
                    q.offer(n);
                    visited[n]=true;
                }
            }
        }
    }
    
    public static void main(String[] str){
        System.out.println("Workning!");
        
        Graph g=new Graph(4);
        g.addEdge(3,0);
        g.addEdge(1,2);
        g.addEdge(0,1);
        BFS(3);
        
    }
    
}