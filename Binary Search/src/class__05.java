public class class__05 {
  static int findFirstAndLastOccurrence(int arr[],int element){
    int n = arr.length;
    int start = 0;
    int end = n-1;
    int result= -1;
    while (start<=end) {
      int mid = (start+((end-start)/2));
      if (arr[mid]==element) {
        end = mid-1;
        result = mid;
        return result;
      }
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println("find and last occurrence of an element");
    int arr[] = {2,4,10,10,10,18,20};
    int element = 10;
    int result = findFirstAndLastOccurrence(arr, element);
    System.out.println("the result is "+result);
  }
  
}
