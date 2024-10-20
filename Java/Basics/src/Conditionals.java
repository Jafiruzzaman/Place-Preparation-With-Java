public class Conditionals {
    public static void main(String[] args) {
        System.out.println("conditionals in java");
//        1. if
        int age = 10;
        if (age>18){
            System.out.println("you can drive");
        }
//        2. if-else
        if (age>18){
            System.out.println("you can drive");
        }else {
            System.out.println("you can't drive");
        }
//        else-if ladder
        if ((age>0) || (age<10)){
            System.out.println("you are above 0 but bellow 10");
        }
        else if ((age>10)  || (age<15)){
            System.out.println("you are above 10 but bellow 15");
        }else if ((age>18)  || (age<25)){
            System.out.println("you are above 18 but bellow 25");
        }else if((age>50) || (age<60)){
            System.out.println("you are above 50 but bellow 60");
        }

//        4. switch-case
//        switch case is the better easy and readable version of if-else statement
//        without break statement all the statement will be executed
        switch (age){
            case 0:
                System.out.println("Your age is 0");
            case 10:
                System.out.println("your are is 10");
            case 20:
                System.out.println("Your age is 20");
            case 50:
                System.out.println("Your age is 50");
            case 60:
                System.out.println("Your age is 60");
            default:
                System.out.println("you age is out of range");
        }

        switch (age){
            case 0:
                System.out.println("Your age is 0");
                break;
            case 10:
                System.out.println("your are is 10");
                break;
            case 20:
                System.out.println("Your age is 20");
                break;
            case 50:
                System.out.println("Your age is 50");
                break;
            case 60:
                System.out.println("Your age is 60");
                break;
            default:
                System.out.println("you age is out of range");
                break;
        }




    }
}
/*
There are 4 types of conditionals in java
1. if
2. if-else
3. else-if ladder
4. switch-case

 */
