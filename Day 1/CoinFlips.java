import java.util.Scanner;
import java.util.Random;

public class CoinFlips {
    public static void main(String[] args) {

        System.out.println("Enter number of flips: ");

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int flips = input.nextInt();

        if (flips < 0) {
            System.out.println("Invalid");
            return;
        }

        int head_count = 0;
        int tail_count = 0;
        float coin_value;

        for (int i = 0; i < flips; i++) {
            coin_value = random.nextFloat();
            if (coin_value < 0.5) {
                tail_count++;
            } else {
                head_count++;
            }
        }

        System.out.println("Head count: "+head_count);
        System.out.println("Tail count: "+tail_count);

        double head_percentage = (double) head_count/flips * 100;
        double tail_percentage = (double) tail_count/flips * 100;

        System.out.println("Heads percentage: " + head_percentage);
        System.out.println("Tails percentage: " + tail_percentage);
    }

}