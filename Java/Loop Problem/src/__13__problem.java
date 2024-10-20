import java.util.Scanner;

public class __13__problem {
    public static void main(String[] args) {
        System.out.println("Rotate a number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for (int i =1;i<=num;i++){
            //
            for (int j =i;j<=num;j++){
                System.out.print(j+" ");
            }
            // rotate number
            for (int j = 1; j <=(i-1) ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
