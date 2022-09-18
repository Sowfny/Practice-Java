package pr1;

import java.util.Arrays;
import java.util.Scanner;

public class Numb {
    public static void main(String[] args) {
        int a;
        int b;
        int n;
        int[] arr;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        System.out.print("Введите нижнюю границу чисел (включительно): ");
        a = in.nextInt();
        System.out.print("Введите верхнюю границу чисел (включительно): ");
        b = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * (b - a + 1)) + a);
            System.out.println(arr[i]);
        }
        System.out.print("Отсортированный массив: \n");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
