package Graphs.MazeEscape;

public class MazeSolver {

  /**
   * The Maze Escape implementation using DFS
   *Find way inside Maze::: of 6*6
   * {1 ,1 ,1 ,1 ,1 ,1 ,}
   * {2 ,1 ,1 ,1 ,0 ,1 ,}
   * {0 ,0 ,0 ,1 ,1 ,1 ,}
   * {0 ,0 ,1 ,1 ,1 ,1 ,}
   * {0 ,1 ,0 ,1 ,1 ,1 ,}
   * {0 ,0 ,0 ,0 ,0 ,0 ,}
   * Possible way through row index 1 and column index 0
   * Possible way through row index 2 and column index 0
   * Possible way through row index 3 and column index 0
   * Possible way through row index 4 and column index 0
   * Possible way through row index 5 and column index 0
   * Possible way through row index 5 and column index 1
   * Possible way through row index 5 and column index 2
   * Possible way through row index 4 and column index 2
   * Possible way through row index 5 and column index 3
   * Possible way through row index 5 and column index 4
   * Solution exist...
   * ------------Another Example----------------
   * Find way inside Maze::: of 6*6
   * {1 ,1 ,1 ,1 ,1 ,1 ,}
   * {2 ,1 ,1 ,1 ,0 ,1 ,}
   * {0 ,0 ,0 ,1 ,1 ,1 ,}
   * {0 ,0 ,0 ,1 ,1 ,1 ,}
   * {0 ,1 ,0 ,1 ,1 ,1 ,}
   * {1 ,0 ,0 ,0 ,1 ,0 ,}
   * Possible way through row index 1 and column index 0
   * Possible way through row index 2 and column index 0
   * Possible way through row index 3 and column index 0
   * Possible way through row index 4 and column index 0
   * Possible way through row index 3 and column index 1
   * Possible way through row index 2 and column index 1
   * Possible way through row index 2 and column index 2
   * Possible way through row index 3 and column index 2
   * Possible way through row index 4 and column index 2
   * Possible way through row index 5 and column index 2
   * Possible way through row index 5 and column index 3
   * Possible way through row index 5 and column index 1
   * There isn't any way!
   *
   * Process finished with exit code 0
   */
  public static void main(String[] args) {

    int [][] mazeToSolve = {
        {1,1,1,1,1,1},
        {2,1,1,1,0,1},
        {0,0,0,1,1,1},
        {0,0,1,1,1,1},
        {0,1,0,1,1,1},
        {0,0,0,0,0,0},
    };

    MazeSolver mazeSolver = new MazeSolver(mazeToSolve, 1, 0);
    mazeSolver.arrayRepresentation(mazeToSolve);
    mazeSolver.findWay();
    System.out.println("------------Another Example----------------");
    int [][] mazeToSolve1 = {
        {1,1,1,1,1,1},
        {2,1,1,1,0,1},
        {0,0,0,1,1,1},
        {0,0,0,1,1,1},
        {0,1,0,1,1,1},
        {1,0,0,0,1,0},
    };
    MazeSolver mazeSolver1 = new MazeSolver(mazeToSolve1, 1, 0);
    mazeSolver1.arrayRepresentation(mazeToSolve1);
    mazeSolver1.findWay();
  }
  private final int[][] maze;
  private final boolean[][] visited;
  private final int rowIndex;
  private final int columnIndex;

  public MazeSolver(int[][] maze, int rowIndex, int columnIndex) {
    this.maze = maze;
    this.visited = new boolean[maze.length][maze.length];
    this.rowIndex = rowIndex;
    this.columnIndex = columnIndex;
  }

  public void findWay() {
    if(dfs(rowIndex, columnIndex)) {
      System.out.println("Solution exist...");
    } else {
      System.out.println("There isn't any way!");
    }
  }

  private boolean isFeasible(int rowIndex, int columnIndex) {
    //outside array index
    if(rowIndex< 0 || rowIndex> maze.length-1)
      return false;

    if(columnIndex< 0 || columnIndex> maze.length-1)
      return false;

    //if visited
    if(visited[rowIndex][columnIndex])
      return false;

    return maze[rowIndex][columnIndex] != 1;
  }

  private boolean dfs(int rowIndex, int columnIndex) {
    //base case
    if(rowIndex == maze.length-1 && columnIndex == maze.length-1)
      return true;

    if(isFeasible(rowIndex, columnIndex)) {
      System.out.println("Possible way through row index "+rowIndex +" and column index "+ columnIndex);
      visited[rowIndex][columnIndex] = true;

      if(dfs(rowIndex+1, columnIndex))
        return true;
      if(dfs(rowIndex-1, columnIndex))
        return true;
      if(dfs(rowIndex, columnIndex+1))
        return true;
      return dfs(rowIndex, columnIndex - 1);
    }
    return false;
  }

  public void arrayRepresentation(int[][] arrayToPrint) {
    System.out.println("Find way inside Maze::: of "+arrayToPrint.length +"*"+arrayToPrint.length);
    for(int[] arr: arrayToPrint){
      System.out.print("{");
      for (int a: arr)
        System.out.print(a+ " ,");
      System.out.println("}");
    }
  }
}
