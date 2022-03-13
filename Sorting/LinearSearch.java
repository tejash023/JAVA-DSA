public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {23, 56, 78, 87, 6, 56};
    int indexToSearch = 78;
    int ans = linearSearch(arr, indexToSearch);
    System.out.println(ans);
  }

  public static int linearSearch(int[] arr, int index){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == index){
        return i;
      }
    }
    return -1;
  }
}
