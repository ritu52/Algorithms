package SortingAlgorithms.QuickSort;

import SortingAlgorithms.Helper.HelperMethods;

public class TestingApp {

  /**
   * The implementation of Quick sort algorithm.
       * Original array input::: 3 0 1 -3 6 6 7
       * Considering indexes to sort from 0 to 6
       * The pivot element is::: -3
       * Considering indexes to sort from 1 to 6
       * The pivot element is::: 7
       * Considering indexes to sort from 1 to 5
       * The pivot element is::: 3
       * Considering indexes to sort from 1 to 2
       * The pivot element is::: 0
       * Considering indexes to sort from 2 to 2
       * The pivot element is::: 1
       * Considering indexes to sort from 4 to 5
       * The pivot element is::: 6
       * Considering indexes to sort from 5 to 5
       * The pivot element is::: 6
       * The sorted array in numerical ascending order::: -3 0 1 3 6 6 7
       * --------------------------------------
       * Considering indexes to sort from 0 to 6
       * The pivot element is::: 3
       * Considering indexes to sort from 0 to 2
       * The pivot element is::: 6
       * Considering indexes to sort from 0 to 0
       * The pivot element is::: 7
       * Considering indexes to sort from 2 to 2
       * The pivot element is::: 6
       * Considering indexes to sort from 4 to 6
       * The pivot element is::: 1
       * Considering indexes to sort from 5 to 6
       * The pivot element is::: -3
       * Considering indexes to sort from 5 to 5
       * The pivot element is::: 0
       * The sorted array in numerical descending order::: 7 6 6 3 1 0 -3
   *
   */
  public static void main(String[] args) {
    int[] numArr = {3, 0, 1,-3,6,6,7};
    QuickSort quickSort = new QuickSort(numArr);
    System.out.print("Original array input::: ");
    HelperMethods.showArray(numArr);
    quickSort.sort("asc");
    System.out.print("The sorted array in numerical ascending order::: ");
    HelperMethods.showArray(numArr);
    System.out.println("--------------------------------------");
    quickSort.sort("desc");
    System.out.print("The sorted array in numerical descending order::: ");
    HelperMethods.showArray(numArr);
  }
}
