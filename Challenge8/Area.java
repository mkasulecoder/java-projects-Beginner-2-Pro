package Challenge8;

/**
 * For this exercise you will write a class named Area. The Area class should
 * provide static methods that calculate the areas of different geometric
 * shapes.
 * The class should have three overloaded static methods named getArea. Here is
 * a description of each method:
 * The first version of the static getArea method will calculate the area of a
 * circle. It should accept the circle's radius as a double, and return the
 * circle's area as a double. See the formula below for calculating the area of
 * a circle.
 * The second version of the static getArea method will calculate the area of a
 * rectangle. It should accept the rectangle's length and width as doubles, and
 * return the rectangle's area as a double. See the formula below for
 * calculating the area of a rectangle.
 * The third version of the static getArea method will calculate the area of a
 * trapezoid. It should accept the trapezoid's base #1 length, base #2 length,
 * and height as doubles, and return the trapezoid's area as a double. See the
 * formula below for calculating the area of a trapezoid.
 * The Area class should also have a main method that calls each of the
 * overloaded getArea methods. It should display the following values, each on a
 * separate line:
 * The area of a circle with a radius of 3. The value should be rounded to two
 * decimal places.
 * The area of a rectangle with a length of 2 and a width of 4. The value should
 * be rounded to one decimal place.
 * The area of a trapezoid with a base lengths of 3 and 4, and a height of 5.
 * The value should be rounded to one decimal place.
 * Here are the formulas for calculating the areas of the shapes:
 * Area of a circle: Area = πr2
 * where π is Math.PI and r is the circle's radius.
 * Area of a rectangle: Area = Width × Length
 * Area of a trapezoid: Area = (base1 + base2) × height / 2
 */

public class Area {
    public static void main(String[] args) {
        // The area of a circle with a radius of 3
        // The value should be rounded to two decimal places.
        double circleArea = getArea(3);
        System.out.printf("%.2f\n", circleArea);

        // The area of a rectangle with a length of 2 and a width of 4. The value should
        // be rounded to one decimal place.
        double triangleArea = getArea(2, 4);
        System.out.printf("%.1f\n", triangleArea);

        // The area of a trapezoid with a base lengths of 3 and 4, and a height of 5.
        // The value should be rounded to one decimal place
        double trapezoidArea = getArea(3, 4, 5);
        System.out.printf("%.1f\n", trapezoidArea);
    }

    /**
     * Area of circle
     * πr2
     * 
     * @param radius
     * @return
     */
    public static double getArea(double radius) {
        return Math.PI * (radius * radius);
    }

    /**
     * Area of Triangle
     * 
     * @param length
     * @return
     */
    public static double getArea(double length, double width) {
        return width * length;
    }

    /**
     * Area of Trapezoid
     * Area = (base1 + base2) × height / 2
     * 
     * @param radius
     * @return
     */
    public static double getArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }
}