package Challenge10;

/**
 * Assume the following Person class has been defined. The Person class holds
 * data about a person. Specifically, it holds a person's name, address, and
 * telephone number.
 */
public class Person {
    private String name;
    private String address;
    private String number;

    public Person(String n, String a, String num) {
        name = n;
        address = a;
        number = num;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setNumber(String n) {
        number = n;
    }
}
