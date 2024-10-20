import java.util.Scanner;

public class __15__problem {
    public static void main(String[] args) {
        System.out.println("convert binary to decimal");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binary = sc.nextInt();
        int pow = 1;
        int result=0;
        for (;  binary>0 ; binary/=10) {
            int lastDigit = binary%10;
            result += lastDigit*pow;
            pow *= 2;
        }
        System.out.println("The result is " + result);
    }
}
