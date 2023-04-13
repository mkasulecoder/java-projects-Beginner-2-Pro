package ObjectOriented;

public class Animal {
    protected String name;

    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark!");
    }
  
}

