package SortingAlgorithms.ShellSort;

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
          swap(j, j-gap);
          j-=gap;
        }
        while(sort.equalsIgnoreCase("desc") &&
            j>=gap && arrayToSort[j-gap] < arrayToSort[j]) {
          swap(j, j-gap);
          j-=gap;
        }
      }
      System.out.println(gap+ "-sorted array");
      showArray();
    }
  }
  private void swap(int i, int j) {
    int temp = arrayToSort[i];
    arrayToSort[i] = arrayToSort[j];
    arrayToSort[j] = temp;
  }
  public void showArray() {
    for (int j : arrayToSort) System.out.print(j + " ");

    System.out.println(" ");
  }
}
