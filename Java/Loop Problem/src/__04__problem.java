import java.util.Scanner;

public class __04__problem {
    public static void main(String[] args) {
        System.out.println("Inverted triangle pattern");
        System.out.println("Enter the number of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for (int i = row; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
