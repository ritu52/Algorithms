package SortingAlgorithms.BubbleSort;

public class BubbleSort {

  private int[] arrayToSort;
  private int count;

  public void sort(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
    this.count =0;
    for(int i=0; i<arrayToSort.length-1;++i) {
      for(int j=0; j<arrayToSort.length-1-i;++j) {
        if(arrayToSort[j+1] < arrayToSort[j]) {
          swap(j, j + 1);
          count++;
        }
      }
    }
    showSortedArray();
  }
  private void showSortedArray() {
    System.out.println("The total swap count: "+ count);
    for (int j : arrayToSort) System.out.print(j + " ");

    System.out.println(" ");
  }

  private void swap(int i, int j) {
    int temp = arrayToSort[i];
    arrayToSort[i] = arrayToSort[j];
    arrayToSort[j] = temp;
  }
}
