package Challenge8;
/**
 * Chapter 8: Programming Project 2
 * Unlimited tries
 * Write a public class named LandTract with the following fields:
 * length – a private int containing the tract's length
 * width – a private int containing the tract's width
 * The class should also have the following methods:
 * Constructor – The class should have a constructor with two int parameters.
 * The first parameter holds the tract's length and the second parameter holds
 * the tract's width. These values should be assigned to the length and width
 * fields, respectively.
 * Copy Constructor – The class should have a copy constructor that accepts
 * another LandTract object as its argument. It should make the object that is
 * being created a copy of the object that is passed as an argument.
 * getLength – returns the value of the length field.
 * getWidth – returns the value of the width field.
 * area – returns the tract's area as an int, which is calculated by multiplying
 * its length by its width.
 * equals – takes another LandTract object as an argument and returns a boolean
 * value. The method returns true if both tracts have the same area, or false
 * otherwise.
 * toString – returns a String with details about the LandTract object in the
 * following format:
 * "Length: 30, Width: 40, Area: 1200"
 * (If, for example, the LandTract object had a length of 30 and a width of 40,
 * its toString method would return the string shown above.)
 * Note: In this exercise do not write a main method. Simply write the LandTract
 * class as specified above.
 */

public class LandTract {
    private int length;
    private int width;

    // Constructor
    public LandTract(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Copy constructor
    public LandTract(LandTract other) {
        this.length = other.getLength();
        this.width = other.getWidth();
    }

    // Getter for length field
    public int getLength() {
        return length;
    }

    // Getter for width field
    public int getWidth() {
        return width;
    }

    // Method to calculate the area of the LandTract
    public int area() {
        return length * width;
    }

    // Method to check if two LandTracts have the same area
    public boolean equals(LandTract other) {
        return this.area() == other.area();
    }

    // toString method to return a string representation of the LandTract object
    public String toString() {
        return "Length: " + length + ", Width: " + width + ", Area: " + area();
    }
}