import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
		int[] input = {5,6,2,4,55,67,90};
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

  public static void quickSort(int[] input) {
		quickSort(input, 0, input.length - 1);
	}

  public static void quickSort(int[] input, int startIndex, int endIndex) {
		if(startIndex >= endIndex) {
			return;
		}
		int partitionIndex = partition(input, startIndex, endIndex);
		quickSort(input, startIndex, partitionIndex-1);
		quickSort(input, partitionIndex+1, endIndex);
	}

  public static int partition(int[] input, int startIndex, int endInedx) {
    int pivot = input[startIndex];
    int count = 0;
    for(int i = startIndex+1; i <= endInedx; i++) {
      if(input[i] <= pivot) { // Including equal
      count++;
      }
    }
    int pivotIndex = startIndex + count;
    input[startIndex] = input[pivotIndex];
    input[pivotIndex] = pivot;
    int i = startIndex, j = endInedx;
    while(i < j) {
      while(i <= endInedx && input[i] <= pivot) {
      i++;
      }
      while(input[j] > pivot) {
      j--;
      }
    if(i <= j) {
      int temp = input[i];
      input[i] = input[j];
      input[j] = temp;
      i++;
      j--;
      }
    }
    return pivotIndex;
  }
}
