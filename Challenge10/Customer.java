package Challenge10;

/**
 * 
 * Write a public class named Customer, which is a subclass of the Person class.
 * The Customer class should have the following fields:
 * customerNumber, a String to hold a customer number
 * receiveMail, a boolean to indicate whether the customer wishes to be on a
 * mailing list
 * The Customer class should also have a constructor that accepts five
 * arguments, in the following order:
 * A String for the customer's name
 * A String for the customer's address
 * A String for the customer's telephone number
 * A String for the customer's customer number
 * A boolean to indicate whether the customer wishes to be on a mailing list
 * The constructor should pass the first three arguments to the superclass
 * constructor and use the last two arguments to initialize the customerNumber
 * and receiveMail fields.
 * In addition, the Customer class should have public accessor methods and
 * public mutator methods for each of the class's fields.
 */
public class Customer extends Person {
    private String customerNumber;
    private boolean receiveMail;

    public Customer(String name, String address, String tel, String num, boolean mailingList) {
        super(name, address, tel);
        this.customerNumber = num;
        this.receiveMail = mailingList;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setReceiveMail(boolean receiveMail) {
        this.receiveMail = receiveMail;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public boolean getReceiveMail() {
        return receiveMail;
    }

}
