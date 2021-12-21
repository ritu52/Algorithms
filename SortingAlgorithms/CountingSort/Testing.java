package SortingAlgorithms.CountingSort;

import SortingAlgorithms.Helper.HelperMethods;

public class Testing {

  /**
   * The implementation of Counting Sort- applicable for numbers and non comparison based sorting approach
       * Original array input::: 1 4 6 9 2 0 5 9 4
       * The counter array created from original array::: 1 1 1 0 2 1 1 0 0 2
       * The cumulative  array created from counter array::: 1 2 3 3 5 6 7 7 7 9
       * The sorted array in numerical ascending order::: 0 1 2 4 4 5 6 9 9
   */
  public static void main(String[] args) {
    int[] inputArray = {1, 4, 6,9,2,0,5, 9, 4};
    CountingSort countingSort = new CountingSort(inputArray);
    System.out.print("Original array input::: ");
    HelperMethods.showArray(inputArray);
    countingSort.sort();
    System.out.print("The sorted array in numerical ascending order::: ");
    HelperMethods.showArray(inputArray);
  }
}
