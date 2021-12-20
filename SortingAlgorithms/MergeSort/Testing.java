package SortingAlgorithms.MergeSort;

import SortingAlgorithms.Helper.HelperMethods;

public class Testing {

  /**
   * Implementation of Merge Sort
         * Original array input::: 3 0 1 -3 6 6 7 8 -9 10
         * The sorted array in numerical ascending order::: -9 -3 0 1 3 6 6 7 8 10
         * --------------------------------------
   */
  public static void main(String[] args) {
    int[] numArr = {3, 0, 1,-3,6,6,7, 8, -9, 10};
    MergeSort mergeSort = new MergeSort(numArr);
    System.out.print("Original array input::: ");
    HelperMethods.showArray(numArr);
    mergeSort.sort();
    System.out.print("The sorted array in numerical ascending order::: ");
    HelperMethods.showArray(numArr);
    System.out.println("--------------------------------------");
  }
}
