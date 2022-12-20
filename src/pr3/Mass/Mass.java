package pr3.Mass;
import javax.imageio.spi.ImageInputStreamSpi;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Mass {
    public static void main(String[] args){
        System.out.println("Введите количество элементов массива");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random m = new Random();
        int mas[]= new int[n];
        System.out.println("Случайный массив=");
        for (int i=0;i<10;i++){
            mas[i]=m.nextInt(100);
            System.out.println( mas[i]);
        }
        Arrays.sort(mas);
        System.out.println("Отсортированный массив=");
        for (int i=0;i<10;i++){
            System.out.println( mas[i]);
        }
    }
}
