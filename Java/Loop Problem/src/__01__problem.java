import java.util.Scanner;

public class __01__problem {
    public static void main(String[] args) {
        System.out.println("print rectangular star matrix");
        System.out.println("enter the number of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("enter the number of col");
        int col = sc.nextInt();
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
