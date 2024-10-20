import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("taking input in java");
        Scanner sc = new Scanner(System.in);
//        for byte
        byte extraMiniNum = sc.nextByte();
        System.out.println(extraMiniNum);
//        for short
        short MiniNum = sc.nextShort();
        System.out.println(MiniNum);
//        for int
        int Num = sc.nextInt();
        System.out.println(Num);
//        for float
        float weight = sc.nextFloat();
        System.out.println(weight);
//        for double
        double height = sc.nextDouble();
        System.out.println(height);
//        for long
        long dinoNumber = sc.nextLong();
        System.out.println(dinoNumber);
//        for first word
        String fName = sc.next();
        System.out.println(fName);
//        for boolean
        boolean isAuthenticated = sc.nextBoolean();
        System.out.println(isAuthenticated);
//        for whole paragraph
        String paragraph = sc.nextLine();
        System.out.println(paragraph);

    }
}
/*
To take input from the user make sure import the Scanner class
Scanner is a built-in package in java.
package : package is a collection of classes, sub packages and Object's
 */