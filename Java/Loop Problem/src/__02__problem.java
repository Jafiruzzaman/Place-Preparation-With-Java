import java.util.Scanner;

public class __02__problem {
    public static void main(String[] args) {
        System.out.println("print holo rectangular pattern");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        System.out.println("Enter the number of column");
        int col = sc.nextInt();
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                // print holo rectangle
                if ((i==0 || j==0 || j==col || i==row)){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
