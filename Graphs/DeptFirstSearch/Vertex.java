package Graphs.DeptFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

  private String name;
  private boolean visited;
  private final List<Vertex> adjacencyList;

  public void setName(String name) {
    this.name = name;
  }

  @SuppressWarnings("BooleanMethodIsAlwaysInverted")
  public boolean isVisited() {
    return visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public List<Vertex> getAdjacencyList() {
    return adjacencyList;
  }

  public Vertex(String name) {
    this.name = name;
    this.adjacencyList = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void addNeighbors(Vertex v) {
    adjacencyList.add(v);
  }


  @Override
  public String toString() {
    return name;
  }
}
