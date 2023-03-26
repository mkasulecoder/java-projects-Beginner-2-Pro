package Challenge8;

/**
 * Assume that the following mutable class has been declared:
 * 
 * 
 * Write an immutable class named Committee that has the following fields:
 * committeeName – a String that holds the name of the committee.
 * chairPerson – a Person object that represents the chairperson of the
 * committee.
 * The immutable Committee class should have the following methods:
 * Constructor – the constructor should accept two arguments. The first argument
 * is a String that holds the name of the committee, and the second argument is
 * a Person object that represents the chairperson of the committee. These
 * arguments should be used to initialize the committeeName and chairPerson
 * fields.
 * getCommitteeName – this method should return the value of the committeeName
 * field.
 * getChairPerson – this method should return a Person object representing the
 * chairperson of the committee.
 * When writing the Committee class, be sure to follow the guidelines for
 * immutable classes presented in this chapter.
 */
public class Person {
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(Person otherPerson) {
        name = otherPerson.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
