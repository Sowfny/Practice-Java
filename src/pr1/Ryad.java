package pr1;

public class Ryad {
    public static void main(String[] args){
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d. %.3f \n", i, 1. / i);
        }
    }
}
