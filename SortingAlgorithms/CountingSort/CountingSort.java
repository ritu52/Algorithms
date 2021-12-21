package SortingAlgorithms.CountingSort;

import SortingAlgorithms.Helper.HelperMethods;

public class CountingSort {

  private final int[] arrayToSort;
  private final int[] counterArray;
  private final static int ITEMS = 10;

  public CountingSort(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
    this.counterArray = new int[ITEMS];
  }

  public void sort() {
    int [] output = new int[arrayToSort.length];
    for (int j : arrayToSort) {
      counterArray[j]++;
    }
    System.out.print("The counter array created from original array::: ");
    HelperMethods.showArray(counterArray);
    for(int i=1; i<counterArray.length;++i) {
      counterArray[i] += counterArray[i-1];
    }
    System.out.print("The cumulative  array created from counter array::: ");
    HelperMethods.showArray(counterArray);
    for(int i=arrayToSort.length-1;i>=0;--i) {
      counterArray[arrayToSort[i]]--;
      output[counterArray[arrayToSort[i]]] = arrayToSort[i];
    }
    System.arraycopy(output, 0, arrayToSort, 0, arrayToSort.length);
  }
}
