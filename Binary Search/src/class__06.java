public class class__06 {
  static int firstOccurrence(int arr[],int element){
    int n = arr.length;
    int start =0;
    int end = n-1;
    int firstOccurrence = -1;
    while (start<=end) {
      int mid = (start+((end-start)/2));
      if (arr[mid]==element) {
        firstOccurrence=mid;
        end=mid-1;
      }else if(arr[mid]>element){
        end=mid-1;
      }else{
        start=mid+1;
      }
    }
    return firstOccurrence;
  }
  static int lastOccurrence(int arr[],int element){
    int n = arr.length;
    int start =0;
    int end = n-1;
    int lastOccurrence = -1;
    while (start<=end) {
      int mid = (start+((end-start)/2));
      if (arr[mid]==element) {
        lastOccurrence=mid;
        start=mid+1;
      }else if(arr[mid]<element){
        start=mid+1;
      }else{
        end=mid-1;
      }
    }
    return lastOccurrence;
  }
  static int countOccurrence(int arr[],int element){
    // for first occurrence
    int first = firstOccurrence(arr, element);
    int last = lastOccurrence(arr, element);
    return (last-first)+1;
  }
  public static void main(String[] args) {
    System.out.println("find the count of element in a sorted array");
    int arr[] = {2,3,4,4,4,4,5,6,7,8,9,10,11,12,13};
    int element = 4;
    int result = countOccurrence(arr, element);
    System.out.println("The result is "+result);
  }
  
}
