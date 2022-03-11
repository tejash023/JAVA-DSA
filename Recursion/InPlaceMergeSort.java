import java.util.*;
public class InPlaceMergeSort {
  public static void main(String[] args){

    int[] arr = {6,5,4,3,2,1};
    mergeSort(arr, 0, arr.length);
    System.out.print(Arrays.toString(arr));

  }

  public static void mergeSort(int[] arr, int start, int end){

    int mid = (start + end) / 2;

    //base condition
    if(end - start == 1){
      return;
    }

    mergeSort(arr, start, mid);
    mergeSort(arr, mid, end);
    mergeInPlace(arr, start, mid, end);
  }

  public static void mergeInPlace(int[] arr, int start, int mid, int end){

    int[] mix = new int[end - start];
    int i = start;
    int j = mid;
    int k = 0;

    while(i < mid && j < end){
      if(arr[i] < arr[j]){
        mix[k] = arr[i];
        i++;
        
      }else{
        mix[k] = arr[j];
        j++;
        
      }
      k++;

      while(i < mid){
        mix[k] = arr[i];
        i++;
        k++;
      }
      while(j < end){
        mix[k] = arr[j];
        j++;
        k++;
      }

      for(int l = 0; l < mix.length; l++){
        arr[l] = mix[l];
      }
    }



  }

}
