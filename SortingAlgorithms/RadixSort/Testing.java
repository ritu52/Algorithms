package SortingAlgorithms.RadixSort;

import SortingAlgorithms.Helper.HelperMethods;

public class Testing {

  /**
   * The implementation of Radix sort - non comparison based sorting approach
       * Original array input::: 12 56 78 99 1000 3 43
       * The sorted array in numerical ascending order::: 3 12 43 56 78 99 1000
   */
  public static void main(String[] args) {
    int[] num = {12, 56, 78,99,1000, 3,43};
    RadixSort radixSort = new RadixSort(num);
    System.out.print("Original array input::: ");
    HelperMethods.showArray(num);
    radixSort.sort();
    System.out.print("The sorted array in numerical ascending order::: ");
    HelperMethods.showArray(num);
  }
}
