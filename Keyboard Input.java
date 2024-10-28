import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accepting string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Accepting integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Accepting double input
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        // Display the inputs
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");

        sc.close();
    }
}
