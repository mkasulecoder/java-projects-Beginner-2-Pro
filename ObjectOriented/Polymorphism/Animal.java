package ObjectOriented.Polymorphism;

/**
 * Polymorphism is the ability of an object to take on many forms. In Java,
 * polymorphism is achieved through method overriding and method overloading.
 * Method overriding occurs when a child class provides its own implementation
 * of a method that is already defined in the parent class. Method overloading
 * occurs when a class has multiple methods with the same name, but different
 * parameters.
 * 
 * Here's an example of polymorphism in Java:
 */

class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        animal1.makeSound(); // "Meow"

        Animal animal2 = new Dog();
        animal2.makeSound(); // "Woof"
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof");
    }
}
