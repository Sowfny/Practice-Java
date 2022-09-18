package pr1;
import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] numbers = input.nextLine().split(" ");
        int sum = 0;
        for (String number : numbers) {

            sum += Integer.parseInt(number);
        }

        System.out.println("The sum of the numbers: " + sum);
    }
}
