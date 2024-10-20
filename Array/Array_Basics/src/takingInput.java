import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
//        print array
        for (int value : values) {
            System.out.print(value+" ");
        }
    }
}
