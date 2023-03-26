package Challenge6;

/**
 * Chapter 6: Programming Project 2
 * 
 * 
 * Write the definition of class named Temperature. The Temperature class will
 * hold a temperature in Fahrenheit and provide methods to get the temperature
 * in Fahrenheit, Celsius, and Kelvin.
 * The class should have the following private field:
 * ftemp: a double that holds a Fahrenheit temperature.
 * The class should have the following methods:
 * Constructor: The constructor should accept a Fahrenheit temperature (as a
 * double) and assign it to the ftemp field.
 * setFahrenheit: This public method should accept a Fahrenheit temperature (as
 * a double) and assign it to the ftemp field.
 * getFahrenheit: This public method should return the value of the ftemp field.
 * The method should accept no arguments.
 * getCelsius: This public method should return the value of the ftemp field
 * converted to Celsius. The method should accept no arguments. Use the
 * following formula to convert to Celsius:
 * Celsius = (5.0 / 9.0) * (Fahrenheit - 32)
 * getKelvin: This public method should return the value of the ftemp field
 * converted to Kelvin. The method should accept no arguments. Use the following
 * formula to convert to Kelvin:
 * Kelvin = ((5.0 / 9.0) * (Fahrenheit - 32)) + 273
 * Note: For this problem, write only the class definition for the Temperature
 * class. Do not write a main method.
 */

public class Temperature {
    private double ftemp;

    public Temperature(double f) {
        ftemp = f;
    }

    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFahrenheit() {
        return ftemp;
    }

    public double getCelsius() {
        return (5.0 / 9.0) * (ftemp - 32);
    }

    public double getKelvin() {
        return ((5.0 / 9.0) * (ftemp - 32)) + 273;
    }

}