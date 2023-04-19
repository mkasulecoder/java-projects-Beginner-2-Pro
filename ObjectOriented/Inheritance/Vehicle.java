package ObjectOriented.Inheritance;

/**
 * Inheritance is a mechanism in which a new class is derived from an existing
 * class, inheriting all the properties and methods of the parent class. The
 * child class can then extend or override the behavior of the parent class. In
 * Java, inheritance is achieved using the keyword "extends".
 * 
 * Here's an example of inheritance in Java:
 */
public class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car started");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start(); // "Vehicle started"

        Car car = new Car();
        car.start(); // "Car started"
    }
}
