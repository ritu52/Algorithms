package Graphs.TopologicalOrdering;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * The implementation of topological ordering using DFS
     * Topological Ordering:::
     * Vertex{name='5'}
     * Vertex{name='4'}
     * Vertex{name='2'}
     * Vertex{name='3'}
     * Vertex{name='1'}
     * Vertex{name='0'}
 */
public class TopologicalOrderingUsingDFS {

  public static void main(String[] args) {

    TopologicalOrderingUsingDFS topologicalOrderingUsingDFS = new TopologicalOrderingUsingDFS();

    List<Vertex> graph = new ArrayList<>();
    graph.add(new Vertex("0"));
    graph.add(new Vertex("1"));
    graph.add(new Vertex("2"));
    graph.add(new Vertex("3"));
    graph.add(new Vertex("4"));
    graph.add(new Vertex("5"));

    graph.get(2).addNeighbors(graph.get(3));
    graph.get(3).addNeighbors(graph.get(1));
    graph.get(4).addNeighbors(graph.get(1));
    graph.get(4).addNeighbors(graph.get(0));
    graph.get(5).addNeighbors(graph.get(2));
    graph.get(5).addNeighbors(graph.get(0));

    for(Vertex vertex: graph) {
      if(!vertex.isVisited())
        topologicalOrderingUsingDFS.dfs(vertex);
    }

    Stack<Vertex> stack = topologicalOrderingUsingDFS.showOrder();
    System.out.println("Topological Ordering:::");
    for(int i=0; i<graph.size(); ++i)
      System.out.println(stack.pop());

  }
  private final Stack<Vertex> stack;

  public  TopologicalOrderingUsingDFS() {
    this.stack = new Stack<>();
  }

  public void dfs(Vertex vertex) {
    vertex.setVisited(true);
    for(Vertex neighbor: vertex.getAdjacencyList()) {
      if(!neighbor.isVisited())
        dfs(neighbor);
    }

    stack.push(vertex);
  }

  public Stack<Vertex> showOrder() {
    return this.stack;
  }
}
