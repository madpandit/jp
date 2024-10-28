// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }
}

// Derived class (Child) that inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Access methods from both the Dog class and the inherited Animal class
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Method of Dog class
    }
}
