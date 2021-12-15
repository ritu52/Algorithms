package SortingAlgorithms.BubbleSort;

public class App {
  /**
   * The implementation of Bubble sort. At every iteration, the largest element is bubbled out at the end.
       * The total swap count: 10
       * 0 1 3 5 6 9
       * The total swap count: 15
       * 5 6 7 8 9 10
   */
  public static void main(String[] args) {
    BubbleSort bubbleSort = new BubbleSort();
    int[] numArr = {5,6,9,1,0,3};
    bubbleSort.sort(numArr);

    int[] numArr1 = {10, 9, 8, 7, 6,5};
    bubbleSort.sort(numArr1);
  }
}
