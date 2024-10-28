public class StringManipulationDemo {
    public static void main(String[] args) {
        // Declare a sample string
        String str = "Hello, Java!";

        // 1. length() - Get the length of the string
        System.out.println("Length of the string: " + str.length());

        // 2. substring() - Extract a portion of the string
        String subStr = str.substring(7, 11); // Extract "Java"
        System.out.println("Substring: " + subStr);

        // 3. toUpperCase() - Convert the string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);
    }
}
