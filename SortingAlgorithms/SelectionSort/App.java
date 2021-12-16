package SortingAlgorithms.SelectionSort;

public class App {

  /**
   * The implementation of Selection sort
       * Original array input::: 5 6 9 1 0 3
       * The sorted array in numerical ascending order::: 0 1 3 5 9 6
       * The sorted array in numerical descending order::: 9 6 5 3 1 0
   */
  public static void main(String[] args) {
    int[] numArr = {5,6,9,1,0,3};
    SelectionSort selectionSort = new SelectionSort(numArr);
    System.out.print("Original array input::: ");
    selectionSort.showArray();
    selectionSort.sort("asc");
    System.out.print("The sorted array in numerical ascending order::: ");
    selectionSort.showArray();
    selectionSort.sort("desc");
    System.out.print("The sorted array in numerical descending order::: ");
    selectionSort.showArray();
  }
}
