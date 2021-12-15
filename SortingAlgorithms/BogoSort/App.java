package SortingAlgorithms.BogoSort;

public class App {
  /**
   * The implementation of Bogo Sort using randomized algorithm. The output may differ each time, code is executed since it's
   * based on permutation.
     * The shuffle counter: 210
     * 0 1 3 5 6 9
     * The shuffle counter: 44
     * 2 5 8 9 10
   */
  public static void main(String[] args) {
    int[] numArr = {5,6,9,1,0,3};
    BogoSort bogoSort = new BogoSort();
    bogoSort.sort(numArr);

    int[] numArr1 = {10, 5,8,2,9};
    bogoSort.sort(numArr1);
  }
}
