package SortingAlgorithms.InsertionSort;

public class TestingApp {
  public static void main(String[] args) {
    int[] numArr = {5,6,9,1,0,3};
    InsertionApp insertionApp = new InsertionApp(numArr);
    System.out.print("Original array input::: ");
    insertionApp.showArray();
    insertionApp.sort("asc");
    System.out.print("The sorted array in numerical ascending order::: ");
    insertionApp.showArray();
    insertionApp.sort("desc");
    System.out.print("The sorted array in numerical descending order::: ");
    insertionApp.showArray();
  }
}
