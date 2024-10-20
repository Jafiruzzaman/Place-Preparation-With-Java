import java.util.Scanner;

public class __12__problem {
    public static void main(String[] args) {
        System.out.println("Find the raise of a to the power of b");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter the power");
        int pow = sc.nextInt();
        int result=1;
        for (int i = 1; i <=pow; i++) {
            result=base*result;

        }
        System.out.println("The result is "+result);
    }
}
