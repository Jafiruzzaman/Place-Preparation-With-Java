import java.util.Scanner;

public class __08__problem {
    public static void main(String[] args) {
        System.out.println("Find the sum of the digits in a given number");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result= 0;
        for (; num>0; num/=10) {
//        find the last digit
            int lastDigit = num%10;
            result+=lastDigit;
        }
        System.out.println("the total sum of the number is "+result);
    }
}
