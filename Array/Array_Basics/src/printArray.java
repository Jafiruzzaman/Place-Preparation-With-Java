public class printArray {
    static void printArray(int[] array){
        int n = array.length;
//        for (int i = 0; i <n; i++) {
//            System.out.println(array[i]);
//
//        }
//        using for each loop
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        System.out.println("print Array using loop");
        int[] array = {1,2,3,4,5,6,7,8};
        printArray(array);
    }
}
