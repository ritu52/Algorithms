package Graphs.GraphsRepresentation;

public class GraphRepresentation {

  /**
   * The Graph representation using: AdjacencyMatrix and AdjacencyList
       * The adjacency matrix representation of graph:::
       * Iterating over Adjacency Matrix takes O(E^2)
       * Edge with weight:  2
       * Edge with weight:  4
       * Edge with weight:  3
       * Edge Weight look up is fast O(1) :4
       * The adjacency list representation of graph:::
       * Neighbors of vertex 'a' are b c
       * Neighbors of vertex 'b' are d
       * Neighbors of vertex 'c' are
       * Neighbors of vertex 'd' are
   */
  private final static int[][] adjacencyMatrix = {
      {0,2,4,0},
      {0,0,0,3},
      {0,0,0,0},
      {0,0,0,0}
  };
  public static void main(String[] args) {

    System.out.println("The adjacency matrix representation of graph::: ");
    System.out.println("Iterating over Adjacency Matrix takes O(E^2)");
    for (int[] matrix : adjacencyMatrix) {
      for (int j = 0; j < adjacencyMatrix.length; ++j) {
        if (matrix[j] != 0) {
          System.out.println("Edge with weight:  " + matrix[j]);
        }
      }
    }
    System.out.println("Edge Weight look up is fast O(1) :"+ adjacencyMatrix[0][2]);
    System.out.println("The adjacency list representation of graph::: ");

    Vertex a = new Vertex("a");
    Vertex b = new Vertex("b");
    Vertex c = new Vertex("c");
    Vertex d = new Vertex("d");

    a.addNeighbors(b);
    a.addNeighbors(c);
    b.addNeighbors(d);

    a.showNeighbors();
    b.showNeighbors();
    c.showNeighbors();
    d.showNeighbors();


  }
}
