package writinghomeworkweek2;
import java.util.Scanner;

/* Write a Java program that takes anumber as input and prints its
multiplication table up to 10.
Test data: Input a number:8
expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 =24
...
8 x 10 = 80
 */
public class Programme_10_MultiplicationTable {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        multiplicationTableOf(number);
        //closing the scanner object
        scanner.close();
    }
    // Printing the multiplication table of entered number
    public static void multiplicationTableOf(int number) {
        System.out.println(number + " x " + 1 + " = " + (number));
        System.out.println(number + " x " + 2 + " = " + (number));
        System.out.println(number + " x " + 3 + " = " + (number));
        System.out.println(number + " x " + 4 + " = " + (number));
        System.out.println(number + " x " + 5 + " = " + (number));
        System.out.println(number + " x " + 6 + " = " + (number));
        System.out.println(number + " x " + 7 + " = " + (number));
        System.out.println(number + " x " + 8 + " = " + (number));
        System.out.println(number + " x " + 9 + " = " + (number));
        System.out.println(number + " x " + 10 + " = " + (number));

    }
}
