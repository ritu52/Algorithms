package SortingAlgorithms.ShellSort;

import SortingAlgorithms.Helper.HelperMethods;

public class TestingApp {
  /**
   * The implementation of Shell Sort- generalization of Insertion sort.
         * Original array input::: 3 0 1 -3 6 6 7
         * Considering elements for sorting at a gap of 3
         * 3-sorted array
         * -3 0 1 3 6 6 7
         * Considering elements for sorting at a gap of 1
         * 1-sorted array
         * -3 0 1 3 6 6 7
         * The sorted array in numerical ascending order::: -3 0 1 3 6 6 7
         * Considering elements for sorting at a gap of 3
         * 3-sorted array
         * 7 6 6 3 0 1 -3
         * Considering elements for sorting at a gap of 1
         * 1-sorted array
         * 7 6 6 3 1 0 -3
         * The sorted array in numerical descending order::: 7 6 6 3 1 0 -3
   */
  public static void main(String[] args) {
    int[] numArr = {3, 0, 1,-3,6,6,7};
    ShellSort shellSort = new ShellSort(numArr);
    System.out.print("Original array input::: ");
    HelperMethods.showArray(numArr);
    shellSort.sort("asc");
    System.out.print("The sorted array in numerical ascending order::: ");
    HelperMethods.showArray(numArr);
    shellSort.sort("desc");
    System.out.print("The sorted array in numerical descending order::: ");
    HelperMethods.showArray(numArr);
  }
}
