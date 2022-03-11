public class binarySearch
{
	public static void main(String[] args) {
		int[] arr = {3,5,7,10,15,18,20};
    int x = 21;
    int ans = binarySearch1(arr,x,0,arr.length - 1);
    System.out.println(ans);
	}

  public static int binarySearch1(int[] arr, int x, int si, int ei){

    //base condition
    if(si > ei){
      return -1;
    }

    int mid = (si + ei) / 2;
    if(arr[mid] == x){
      return mid;
    }else if(arr[mid] < x){
      return binarySearch1(arr, x, mid + 1, ei);
    }else{
      return binarySearch1(arr, x, si, mid - 1);
    }

  }
}