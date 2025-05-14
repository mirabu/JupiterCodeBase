package GraphData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GraphD{
    Map<Integer, List<Integer>> adjList;

    GraphD(){
        adjList=new HashMap<>();
    }


    public void addVertex(int ver){
        adjList.putIfAbsent(ver,new ArrayList<>());
        //put if not present
    }

    public void addEdge(int source,int dest){
        addVertex(source);
        addVertex(dest);
        adjList.get(source).add(dest);
        adjList.get(dest).add(source);
    }

    public void printGraph(){
        for (Map.Entry<Integer,List<Integer>> entry : adjList.entrySet()){
            System.out.print(entry.getKey()+"->");

            for (Integer linkData : entry.getValue()){
                System.out.print(linkData+" ");
            }
            System.out.println();
        }

    }


}



public class GraphStruct {
    public static void main(String[] args) {
        GraphD graph = new GraphD();


        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
