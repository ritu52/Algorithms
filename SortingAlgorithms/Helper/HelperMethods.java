package SortingAlgorithms.Helper;

public class HelperMethods {

  public static void swap(int i, int j, int[] arrayToSort) {
    int temp = arrayToSort[i];
    arrayToSort[i] = arrayToSort[j];
    arrayToSort[j] = temp;
  }
  public static void showArray(int[] arrayToSort) {
    for (int j : arrayToSort) System.out.print(j + " ");

    System.out.println(" ");
  }
}
