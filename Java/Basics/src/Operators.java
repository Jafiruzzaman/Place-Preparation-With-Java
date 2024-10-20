public class Operators {
    public static void main(String[] args) {
        System.out.println("Operators in java");
//    1. Assignment Operator
//      equals to (=)
        int a = 10;
//      plus equals to (+=)
        a += 10;
//      minus equals to (-=)
        a -= 5;
//      multiply equals to (*=)
        a *= 5;
//      Divide equals to (/=)
        a /= 10;

//    2. Arithmetic Operator
//      plus(+)
        int sum = a + 7;
        System.out.println(sum);
//      minus(-)
        sum = a - 7;
        System.out.println(sum);
//      multiply(*)
        sum = a * 7;
        System.out.println(sum);
//      divide(/)
        sum = a / 7;
        System.out.println(sum);
//      modulo(%)
        sum = a % 7;
        System.out.println(sum);

//    3. Relational Operator
//        double equals to (==)
        System.out.println("is 10 == 5 is it " + (10 == 5));
//        double equals to (>)
        System.out.println("is 10 > 5 is it " + (10 > 5));

//        double equals to (>=)
        System.out.println("is 10 >= 5 is it " + (10 >= 5));

//        double equals to (<)
        System.out.println("is 10 < 5 is it " + (10 < 5));

//        double equals to (<=)
        System.out.println("is 10 <= 5 is it " + (10 <= 5));

//        not equals to (!=)
        System.out.println("is 10 != 5 is it " + (10 != 5));

//      4. Logical Operator
//        logical and(&&) if both condition becomes true only then it returns true
        System.out.println("is 10 < 5 && 10 != 5 is it "+((10<5) && (10 != 5)));
//        logical or(||) only one condition become true then it returns true
        System.out.println("is 10 < 5 || 10 != 5 is it "+((10<5) || (10 != 5)));
//        logical not(!) it's vice-versa.it converts true to false and false to true
        System.out.println("it convert false to "+(!false));

//       5. Bitwise Operator
        
//      bitwise and (&)
            System.out.println("The operation of bitwise "+(10&5));
//      bitwise or (|)
            System.out.println("The operation of bitwise "+(10|5));
//      bitwise not (~)
            System.out.println("The bitwise operation of not is "+(~5));
//      bitwise xor(^)
            System.out.println("The bitwise xor operation is "+(10^5));

//        6. Unary Operator
//      plus(+)
        int addition = 10+5;
        System.out.println(addition);
//      plus(-)
        int subtracktion = 10-5;
        System.out.println(subtracktion);
//      prefix increment(++a)
        ++addition;
        System.out.println(addition);
//      post increment(a++)
        addition++;
        System.out.println(addition);
//      prefix decrement(++a)
        System.out.println(--subtracktion);
//      post decrement(a++)
        System.out.println(subtracktion--);
    }
}
/*
There are 6 types of Operators in java
    here a and 10 are operands and = is operators
1. Assignment Operator
2. Arithmetic Operator
3. Relational Operator
4. Logical Operator
5. Bitwise Operator
6. Unary Operator
 */