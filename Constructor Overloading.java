class Rectangle {
    int length, width;

    // Default constructor
    Rectangle() {
        length = 0;
        width = 0;
    }

    // Parameterized constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void displayArea() {
        System.out.println("Area: " + (length * width));
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle rect1 = new Rectangle();
        rect1.displayArea();

        // Using parameterized constructor
        Rectangle rect2 = new Rectangle(10, 5);
        rect2.displayArea();
    }
}
