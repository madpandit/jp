// Interface Animal
interface Animal {
    void sound();
}

// Base class Mammal
class Mammal {
    void type() {
        System.out.println("I am a mammal.");
    }
}

// Derived class Dog inherits from Mammal and implements Animal
class Dog extends Mammal implements Animal {
    // Implement the sound() method from Animal interface
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class to demonstrate hybrid inheritance
public class HybridInheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog dog = new Dog();

        // Accessing methods from both Mammal (class) and Animal (interface)
        dog.type(); // Method from Mammal class
        dog.sound(); // Method from Animal interface
    }
}
