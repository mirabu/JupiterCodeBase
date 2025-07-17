package GraphData;

public class GraphScale {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
        graph.connection("A","B",4);
        graph.connection("A", "C", 2);
        graph.connection("B", "D", 3);
        graph.connection("C", "E", 5);
        graph.connection("E", "D", 1);

        graph.printGraph();
    }
}
