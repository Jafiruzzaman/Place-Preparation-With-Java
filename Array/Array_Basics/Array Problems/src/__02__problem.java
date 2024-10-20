public class __02__problem {
    public static int findMaxValue(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Find the max value of an array");
        int[] arr = {10, 5, 8, 20, 15};
        System.out.println("The max vlaue is "+findMaxValue(arr));
    }
}
