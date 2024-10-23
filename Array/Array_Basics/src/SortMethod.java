import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        System.out.println("sort an array using built in method");
        int arr[] = {2,1,5,3,45,4,8,7,9};
//        it's deep copy
        Arrays.sort(arr);
        for(int n:arr){
            System.out.println(n);
        }
    }
}
