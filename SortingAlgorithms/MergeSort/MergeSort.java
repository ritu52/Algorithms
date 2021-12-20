package SortingAlgorithms.MergeSort;

public class MergeSort {

  private final int[] arrayToSort;
  private final int[] tempArray;

  public MergeSort(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
    this.tempArray = new int[arrayToSort.length];
  }

  public void sort() {
    divide(0, arrayToSort.length-1);
  }

  private void divide(int low, int high) {

    if(low>=high) return;

    int middleIndex = (low+high)/2;
    divide(low, middleIndex);
    divide(middleIndex+1, high);

    conquer(low, middleIndex, high);
  }

  private void conquer(int low, int middleIndex, int high) {

    System.arraycopy(arrayToSort, 0, tempArray, 0, arrayToSort.length);

    int i =low;
    int j=middleIndex+1;
    int k =low;

    while(i<=middleIndex && j<=high) {
      if(tempArray[i] < tempArray[j]) {
        arrayToSort[k] = tempArray[i];
        ++i;
      } else {
        arrayToSort[k] = tempArray[j];
        ++j;
      }
      ++k;
    }

    while(i<=middleIndex) {
      arrayToSort[k] = tempArray[i];
      ++k;
      ++i;
    }
    while(j<=high) {
      arrayToSort[k] = tempArray[j];
      ++k;
      ++j;
    }
  }
}
