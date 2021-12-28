package Graphs.DeptFirstSearch;

import java.util.ArrayList;
import java.util.List;

/**
 * The Depth-First Search implementation using Stack data structure.
 * The console output of below program is:::
       * Vertex in consideration::: A
       * Vertex in consideration::: B
       * Vertex in consideration::: C
       * Vertex in consideration::: D
       * Vertex in consideration::: E
       * Vertex in consideration::: F
       * Vertex in consideration::: G
       * Vertex in consideration::: H
 */
public class DepthFirstSearchUsingRecursion {


  public static void main(String[] args) {
    DepthFirstSearchUsingRecursion depthFirstSearch = new DepthFirstSearchUsingRecursion();
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
    System.out.println("Vertex in consideration::: "+ v);
      for(Vertex neighbor: v.getAdjacencyList()) {
        if(!neighbor.isVisited()) {
          neighbor.setVisited(true);
          depthFirstSearch(neighbor);
        }
      }
  }
}
