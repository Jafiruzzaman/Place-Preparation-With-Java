public class __04__problem {
  // count occurrence
  public static int countOccurrence(int[] arr, int target) {
    int n = arr.length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
        count++;
      }
    } 
    return count;
  }
  public static void main(String[] args) {
    System.out.println("__04__problem");
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,1,2,3,4,5,6,7,8};
    int target = 5;
    int count = countOccurrence(arr, target);
    System.out.println("The number " + target + " appears " + count + " times in the array.");
  }
}
