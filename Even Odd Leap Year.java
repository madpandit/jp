import java.util.Scanner;

public class EvenOddLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check even or odd number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " is even.");
        else
            System.out.println(number + " is odd.");

        // Check leap year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

        sc.close();
    }
}
