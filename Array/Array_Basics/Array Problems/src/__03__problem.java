public class __03__problem {
    static int findIndex(int[] arr,int target){
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index= i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println("return the index of the target element");
        int[] arr = {2, 4, 6, 8, 10};
        int target = 10;
        int index = findIndex(arr, target);
        System.out.println("the index is "+index);
    }
}
