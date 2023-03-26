package Challenge6;

/**
 * Chapter 6: Programming Project 1
 * 
 * Write the definition for a class named Car that has the following private
 * fields:
 * yearModel: An int that holds the car's year model
 * make: A String object that holds the make of the car
 * speed: An int that holds the car's current speed
 * In addition, the class should have the following methods:
 * Constructor: Accepts two arguments. The first argument is the car's year
 * model and the second argument is the car's make. These values should be
 * assigned to the yearModel and make fields. The constructor should also assign
 * 0 to the speed field.
 * getYearModel: A public method that returns the value stored in the yearModel
 * field.
 * getMake: A public method that returns the value stored in the make field.
 * getSpeed: A public method that returns the value stored in the speed field.
 * setYearModel: A public method that accepts an int argument that is assigned
 * to the yearModel field. The method returns no value.
 * setMake: A public method that accepts a String argument that is assigned to
 * the make field. The method returns no value.
 * setSpeed: A public method that accepts an int argument that is assigned to
 * the speed field. The method returns no value.
 * accelerate: A public void method that adds 5 to the speed field.
 * brake: A public void method that subtracts 5 from the speed field.
 * Note: For this problem, write only the class definition for the Car class. Do
 * not write a main method.
 */

public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int year, String carMake) {
        yearModel = year;
        make = carMake;
        speed = 0;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
    }
}
