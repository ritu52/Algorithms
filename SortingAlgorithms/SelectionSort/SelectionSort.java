package SortingAlgorithms.SelectionSort;

public class SelectionSort {

  private int[] arrayToSort;

  public SelectionSort(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
  }
  public void sort(String order) {

    for(int i=0;i<arrayToSort.length-1;++i) {
      int index = i;
      for(int j=i+1;j<arrayToSort.length;++j) {
        if(arrayToSort[j] < arrayToSort[index] && order.equalsIgnoreCase("asc"))
          index = j;
        if(arrayToSort[j] > arrayToSort[index] && order.equalsIgnoreCase("desc"))
          index = j;

      }
        if(index != i) {
          swap(i, index);
        }
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
