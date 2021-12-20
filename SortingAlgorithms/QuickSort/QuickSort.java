package SortingAlgorithms.QuickSort;

import SortingAlgorithms.Helper.HelperMethods;

public class QuickSort {

  private int[] arrayToSort;

  public QuickSort(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
  }

  public void sort(String sort) {
    sort(0, arrayToSort.length-1, sort);
  }

  private void sort(int low, int high, String sort) {
    if(high<low) return;

    int pivot = partition(low, high, sort);
    sort(low, pivot-1, sort);
    sort(pivot+1, high, sort);
  }

  private int partition(int low, int high, String sort) {
    System.out.println("Considering indexes to sort from "+ low + " to " +high);
    int pivotIndex = (low+high)/2;
    HelperMethods.swap(pivotIndex, high, arrayToSort);

    int i = low;
    for(int j=low; j<high;++j) {
      if( sort.equalsIgnoreCase("asc") &&
          arrayToSort[j] < arrayToSort[high]) {
        HelperMethods.swap(i, j, arrayToSort);
        i++;
      }
      if(sort.equalsIgnoreCase("desc") &&
          arrayToSort[j] > arrayToSort[high]) {
        HelperMethods.swap(i, j, arrayToSort);
        i++;
      }
    }
    HelperMethods.swap(i, high,arrayToSort);
    System.out.println("The pivot element is::: "+ arrayToSort[i]);
    return i;
  }

}
