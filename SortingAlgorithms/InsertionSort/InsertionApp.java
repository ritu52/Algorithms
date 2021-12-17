package SortingAlgorithms.InsertionSort;

public class InsertionApp {

  private int[] arrayToSort;

  public InsertionApp(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
  }

  public void sort(String sort) {

    for(int i=1; i<arrayToSort.length; ++i) {

      int j = i;
      while(sort.equalsIgnoreCase("asc") &&
          j>0 && arrayToSort[j-1] > arrayToSort[j]) {
        swap(j, j-1);
        j--;
      }
      while(sort.equalsIgnoreCase("desc") &&
          j>0 && arrayToSort[j-1] < arrayToSort[j]) {
        swap(j, j-1);
        j--;
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
