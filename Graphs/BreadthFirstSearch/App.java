package Graphs.BreadthFirstSearch;

public class App {
  /**
   * The implementation of BFS traversal
   * The BFS traverse on the nodes is:::
   * Actual vertex: A
   * Actual vertex: B
   * Actual vertex: F
   * Actual vertex: G
   * Actual vertex: C
   * Actual vertex: D
   * Actual vertex: H
   * Actual vertex: E
   */
  public static void main(String[] args) {
    BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
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

    System.out.println("The BFS traverse on the nodes is::: ");
    breadthFirstSearch.traverse(a);
  }
}
