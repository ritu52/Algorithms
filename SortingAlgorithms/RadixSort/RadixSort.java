package SortingAlgorithms.RadixSort;

import java.util.Arrays;

public class RadixSort {

  private int[] arrayToSort;
  private final static int ITEMS = 10;

  public RadixSort(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
  }
  public void sort() {
    int place =1;
    for(int i=0; i<getMaxDigit();++i) {
      countingSort(place);
      place *= 10;
    }
  }
  public void countingSort(int place) {
    int [] output = new int[arrayToSort.length];
    int [] counterArray = new int[ITEMS];
    for (int j : arrayToSort) {
      counterArray[(j / place) % ITEMS]++;
    }
    for(int i=1; i<counterArray.length;++i) {
      counterArray[i] += counterArray[i-1];
    }
    for(int i=arrayToSort.length-1;i>=0;--i) {
      counterArray[(arrayToSort[i]/place) % ITEMS]--;
      output[counterArray[(arrayToSort[i]/place) % ITEMS]] = arrayToSort[i];
    }
    System.arraycopy(output, 0, arrayToSort, 0, arrayToSort.length);
  }

  private int getMaxDigit() {
    int maxItem = Arrays.stream(arrayToSort).max().getAsInt();
    return String.valueOf(maxItem).length();
  }
}
