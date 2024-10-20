public class Loops {
    public static void main(String[] args) {
        System.out.println("loops in java");
        // 1. for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // 2 while loops
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        // 3 do-while loop
        i = 0;
        do {
            System.out.println(i);
            i++;

        } while (i<10);
    }
}
/*
There are 3 types of loop in java
1. for loop
    syntax for loop

    for(initialization,condition,updation){
        code
    }

2. while loop
    syntax of while loop
    initialization
    while(condition){
        code
        updation
    }
3. do-while loop
    syntax of do-while loop
    initialization
    do{
        code
        updation
    }while(condition);

 */