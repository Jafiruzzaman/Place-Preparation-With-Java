import java.util.Scanner;

public class __06__problem {
    public static void main(String[] args) {
        System.out.println("reverse triangle pattern ");
        System.out.println("enter the number of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = 0; i <=row; i++) {
            for (int j = 0; j <=row-i; j++) {
                System.out.print("  ");

            }
            // print the star
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
