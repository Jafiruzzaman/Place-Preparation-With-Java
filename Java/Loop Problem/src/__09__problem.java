import java.util.Scanner;

public class __09__problem {
    public static void main(String[] args) {
        System.out.println("reverse a digit");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for (;  num>0 ; num/=10) {
//            get the last digit
            int lastDigit = num%10;
            result = lastDigit + (10*result);
        }
        System.out.println("The result is "+result);
    }
}
