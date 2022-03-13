public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {2, 5, 6, 16, 18, 26, 30};
    int elementToSearch = 5;
    int ans = binarySearch(arr, elementToSearch);
    System.out.println(ans);
  }

  public static int binarySearch(int[] arr, int index){
    int start = 0;
    int end = arr.length - 1;

    int mid = (start + end) / 2;

    while(start <= end){

      if(arr[mid] < index){
        start = mid + 1;
      }else if(arr[mid] > index){
        end = mid - 1;
      }else{
        return mid;
      }

    }
    return -1;
  }
}
