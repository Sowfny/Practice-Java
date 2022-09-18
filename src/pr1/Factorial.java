package pr1;

import java.util.Scanner;

public class Factorial {
    public static int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите получить: ");
        n = in.nextInt();
        System.out.printf(" Факториал %d равен = %d", n, calc(n));
    }
}

