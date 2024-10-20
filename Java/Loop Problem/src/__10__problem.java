import java.util.Scanner;

public class __10__problem {
    public static  void main(String[] args){
        System.out.println("Find the sum of the following series entered by the user");
        System.out.println("Enter The number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for (int i = 0; i <=num ; i++) {
            result+=i;
        }
        System.out.println("The result is "+result);
    }

}
