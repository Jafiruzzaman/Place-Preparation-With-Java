import java.util.Scanner;

public class __07__problem {
    public static void main(String[] args){
        System.out.println("count the number of digits for the given number");
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i <num; i++) {
//            get the last digit
            int lastDigit = num%10;
            count++;
            num/=10;
        }
        System.out.println("The result is "+count);
    }
}
