package GraphData;

import java.util.*;

//Graph Type	Algorithm	Description
//Unweighted	BFS	Finds shortest path in terms of hops
//Weighted (no negative weights)	Dijkstra	Finds minimum cost path
//Weighted (with negative weights)	Bellman-Ford	Handles negative weights
//All pairs	Floyd-Warshall	For every node-to-node path

public class WeightedGraph {
    Map<String, List<Edge>>  graph = new HashMap<>();

    public void connection(String source, String target, int values){
      //one way
       graph.putIfAbsent(source,new ArrayList<>());
       graph.get(source).add(new Edge(target,values));

       //two-way
        graph.putIfAbsent(target,new ArrayList<>());
        graph.get(target).add(new Edge(source,values));


    }

    public void printGraph(){
        for (var data: graph.entrySet()){
            System.out.print(data.getKey()+" ->");

            for (var edgeData : data.getValue()){
                System.out.print(edgeData.target+"("+edgeData.value+") ");
            }
            System.out.println();
        }
    }

}
