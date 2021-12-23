package Graphs.GraphsRepresentation;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
  private final String name;
  private final List<Vertex> adjacencyList;

  public Vertex(String name) {
    this.name = name;
    this.adjacencyList = new ArrayList<>();
  }

  public void addNeighbors(Vertex v) {
    adjacencyList.add(v);
  }

  public void showNeighbors() {
    System.out.print("Neighbors of vertex '"+name +"' are ");
    for(Vertex v: adjacencyList)
      System.out.print(v+ " ");

    System.out.println(" ");
  }

  @Override
  public String toString() {
    return name;
  }
}
