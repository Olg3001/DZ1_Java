// Вычислить n-ое треугольного число (сумма чисел от 1 до n)

import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args) {
        System.out.printf("Input integer n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            mult *= i;            
        }
        System.out.printf("Sum of numbers from 1 to %d is %d%n", n, sum);
        System.out.printf("Product od numbers from 1 to %d is %d%n", n, mult);
        num.close();
     }
}