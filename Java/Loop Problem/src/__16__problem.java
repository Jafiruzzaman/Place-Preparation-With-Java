import java.util.Scanner;

public class __16__problem {
    public static void main(String[] args) {
        System.out.println("convert decimal to binary");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = 1;
        int result=0;
        while (num > 0){
            int lastDigit = num%2;
            result +=(lastDigit*(pow));
            pow*=10;
            num/=2;
        }
        System.out.println("Binary equivalent: "+result);
    }
}
