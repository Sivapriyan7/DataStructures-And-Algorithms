package DS_Practice.Graph.Adj_List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    static ArrayList<ArrayList<Integer>> graph;
    int V;

    Graph(int nodes) {
        V = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v, int u)
    {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printGraph()
    {
        for (int i=0; i<V; i++)
        {
            System.out.print("Node "+i);
            for (int x : graph.get(i))
            {
                System.out.print(" -> " + x);
            }
            System.out.println();
        }
    }

    public ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> bfs_list = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        vis[0] = true;

        while (!queue.isEmpty())
        {
            Integer node = queue.poll();
            bfs_list.add(node);

            for (Integer it: adj.get(node))
            {
                if(!vis[it])
                {
                    vis[it] = true;
                    queue.add(it);
                }
            }
        }

        return bfs_list;
    }

    public static void dfs(int node, boolean vis[],ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls)
    {
        vis[node] = true;
        ls.add(node);

        for (Integer it : adj.get(node))
        {
            if(!vis[it])
            {
                dfs(it,vis,adj,ls);
            }
        }

    }


    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,3);
        g.addEdge(0,1);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(1,2);
        g.addEdge(3,1);
        g.addEdge(4,1);
        g.printGraph();
        System.out.println("bfs "+g.bfs(5,graph));

        boolean vis[]  = new boolean[5];
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,vis,graph,ls);
        System.out.println("dfs "+ls);

    }
}
