class Person {
    // Attributes of the class
    String name;
    int age;

    // Method of the class
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person();

        // Setting object attributes
        person1.name = "John";
        person1.age = 25;

        // Calling the method using the object
        person1.displayInfo();
    }
}
