public class class__02 {
    static int findIndex (int arr[],int target){
        int size = arr.length;
        int start = arr[0];
        int end = arr[size-1];
        while (start<=end) {
            int mid = (start+(end-start)/2);
            // if targets in 
            if (arr[mid]==target) {
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("find the element in a sorted array and return the index of the element");
        int arr[] = {1,2,3,4,5,6,7,8,9}; // this array is already sorted
        int target = 9;
        int result = findIndex(arr, target);
        System.out.println("the result is "+result);
        
    }
}
