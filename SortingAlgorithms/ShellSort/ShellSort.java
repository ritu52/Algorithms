package SortingAlgorithms.ShellSort;

import SortingAlgorithms.Helper.HelperMethods;

public class ShellSort {

  private int[] arrayToSort;

  public ShellSort(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
  }

  public void sort(String sort) {
    for (int gap= arrayToSort.length/2; gap>0;gap/=2) {
      System.out.println("Considering elements for sorting at a gap of "+ gap);
      for(int i=gap; i<arrayToSort.length; ++i) {

        int j = i;
        while(sort.equalsIgnoreCase("asc") &&
            j>=gap && arrayToSort[j-gap] > arrayToSort[j]) {
          HelperMethods.swap(j, j-gap,arrayToSort);
          j-=gap;
        }
        while(sort.equalsIgnoreCase("desc") &&
            j>=gap && arrayToSort[j-gap] < arrayToSort[j]) {
          HelperMethods.swap(j, j-gap,arrayToSort);
          j-=gap;
        }
      }
      System.out.println(gap+ "-sorted array");
      HelperMethods.showArray(arrayToSort);
    }
  }
}
