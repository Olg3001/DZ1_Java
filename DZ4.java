// Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

import java.util.Scanner;

public class DZ4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        int a = iScanner.nextInt();
        System.out.print("Input the second integer: ");
        int b = iScanner.nextInt();
        System.out.print(
                "Choose opeartion and input sign. For addition +, for multiplication *, for division /, for remainder of division % , subtraction - :");
        String operation = iScanner.next();
        iScanner.close();
        switch (operation) {
            case "+":
                System.out.printf("Numbers sum is: %d", a + b);
                break;
            case "*":
                System.out.printf("Product of numbers is: %d", a * b);
                break;
            case "/":
                System.out.printf("Quotient of first and second numbers is %d, and of second and first numbers is %d", a / b, b / a);
                break;
            case "%":
                System.out.printf("Reminder of division of first and second numbers is %d, and od second and first numbers is %d", a % b,
                        b % a);
                break;
            case "-":
                System.out.printf("Subtraction of first and second numbers is %d, and of second and first numbers is %d", a - b,
                        b - a);
                break;
            default:
                System.out.printf("Wrong input");
                break;
        }
    }
}