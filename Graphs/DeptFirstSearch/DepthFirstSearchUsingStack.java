package Graphs.DeptFirstSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * The Depth-First Search implementation using Stack data structure.
 * The console output of below program is:::
       * Vertex in consideration::: A
       * Vertex in consideration::: G
       * Vertex in consideration::: H
       * Vertex in consideration::: F
       * Vertex in consideration::: B
       * Vertex in consideration::: D
       * Vertex in consideration::: E
       * Vertex in consideration::: C
 */
public class DepthFirstSearchUsingStack {

  private final Stack<Vertex> stack;

  public DepthFirstSearchUsingStack() {
    this.stack = new Stack<>();
  }

  public static void main(String[] args) {
    DepthFirstSearchUsingStack depthFirstSearch = new DepthFirstSearchUsingStack();
    Vertex a = new Vertex("A");
    Vertex b = new Vertex("B");
    Vertex c = new Vertex("C");
    Vertex d = new Vertex("D");
    Vertex e = new Vertex("E");
    Vertex f = new Vertex("F");
    Vertex g = new Vertex("G");
    Vertex h = new Vertex("H");

    a.addNeighbors(b);
    a.addNeighbors(f);
    a.addNeighbors(g);

    b.addNeighbors(c);
    b.addNeighbors(d);

    c.addNeighbors(b);

    d.addNeighbors(e);
    d.addNeighbors(b);

    e.addNeighbors(d);

    f.addNeighbors(a);

    g.addNeighbors(h);
    g.addNeighbors(a);

    h.addNeighbors(g);

    List<Vertex> vertexList = new ArrayList<>();
    vertexList.add(a);
    vertexList.add(b);
    vertexList.add(c);
    vertexList.add(d);
    vertexList.add(e);
    vertexList.add(f);
    vertexList.add(g);
    vertexList.add(h);
    depthFirstSearch.depthFirstSearch(vertexList);
  }
  public void depthFirstSearch(List<Vertex> vertexList) {
    for(Vertex v : vertexList) {
      if(!v.isVisited()) {
        v.setVisited(true);
        depthFirstSearch(v);
      }
    }
  }

  private void depthFirstSearch(Vertex v) {
    stack.add(v);
    v.setVisited(true);

    while (!stack.isEmpty()) {
      Vertex vertex = stack.pop();
      System.out.println("Vertex in consideration::: "+ vertex);
      for(Vertex neighbor: vertex.getAdjacencyList()) {
        if(!neighbor.isVisited()){
          neighbor.setVisited(true);
          stack.add(neighbor);
        }
      }
    }
  }
}
