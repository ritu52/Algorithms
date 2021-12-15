package SortingAlgorithms.BogoSort;

public class BogoSort {

  private int[] arrayToSort;
  private int counter;

  public void sort(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
    this.counter = 0;
    while(!isSorted()) {
      counter++;
      shuffle();
    }

    showSortedArray();
  }

  private void showSortedArray() {
    System.out.println("The shuffle counter: "+ counter);
    for (int j : arrayToSort) System.out.print(j + " ");

    System.out.println(" ");
  }

  //Fisher-Yates Algorithm
  private void shuffle() {
    for(int i= arrayToSort.length-1;i>=0;--i){
      int j = (int) (Math.random()*i);
      swap(i,j);
    }
  }

  private void swap(int i, int j) {
    int temp = arrayToSort[i];
    arrayToSort[i] = arrayToSort[j];
    arrayToSort[j] = temp;
  }

  private boolean isSorted() {
    for(int i=0; i<arrayToSort.length-1;++i)
      if(arrayToSort[i+1] < arrayToSort[i])
        return false;

    return true;
  }
}
