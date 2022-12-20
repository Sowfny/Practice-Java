package pr3.Vvod;
import  java.util.Scanner;
import java.util.Arrays;

public class Vvod {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n = 0;

        while (n <= 3) {
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n <= 3) {
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                in.next();
            }
        }
        int[] mas1 = new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            mas1[i] = (int) (Math.random() * (n + 1));
            if (mas1[i] % 2 == 0) {
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(mas1));
        int[] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (mas1[i] % 2 == 0) {
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));
    }
}
