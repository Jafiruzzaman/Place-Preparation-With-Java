public class class__03 {
  static int findOccurrenceInDescending(int arr[],int element){
    int n = arr.length;
    int start = 0;
    int end = n-1;
    while (start<=end) {
      int mid = (start+((end-start)/2));
      if (arr[mid]==element) {
        return mid;
      }
      else if(arr[mid]>element){
        start=mid+1;
      }
      else{
        end=mid-1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    System.out.println("find");
    // 
    int arr[] = {18,15,12,10,9,7,6,5,4,3,2,1};
    int element = 4;
    int result = findOccurrenceInDescending(arr, element);
    System.out.println("the result is "+result);
  }
  
}