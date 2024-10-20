public class __01__problem {
    static int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("print the sum of the given array");
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Sum: " + sum(array));
    }
}
