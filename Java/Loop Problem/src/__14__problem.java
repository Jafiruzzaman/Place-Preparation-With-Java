import java.util.Scanner;

public class __14__problem {
    public static void main(String[] args) {
        System.out.println("print 1 and 2 rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter col");
        int col = sc.nextInt();
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col ; j++) {
                if ((i+j)%2==0){
                    System.out.print(1+" ");
                }else {
                    System.out.print(2+" ");
                }
            }
            System.out.println();
        }
    }
}
