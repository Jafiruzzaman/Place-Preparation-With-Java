public class BasicOOPs {
//    create a class
    public static class Car {
        // attributes
    int price;
    int releaseYear;
    int wheelCount;

    // methods
    public void start() {
        System.out.println("Car started");
    }
}
    public static void main(String[] args) {
        System.out.println("Basic OOPs Theory");

//      create objects the car instance
        Car bmw = new Car();
//        assign values
        bmw.price = 100000;
        bmw.releaseYear = 2020;
        bmw.wheelCount = 4;
        System.out.println(bmw.price);
        System.out.println(bmw.releaseYear);
        System.out.println(bmw.wheelCount);
        bmw.start(); // calling method

    }
}
/*
OOPs theory
The full-form of the OOP is Object-Oriented Programming.OOPs helps us to solve the real world programming
for example
    in a game
    the streets,cars,trees are made by OOPs
    we can create a class for each object
Class:
Class is a user-defined blueprint of attributes and methods
Object:
Object is an instance of a class
Attributes:
Attributes are the properties of a class
Methods:
Methods are the behavior of a class
Static:
static allow to call methods without creating classes
 */
