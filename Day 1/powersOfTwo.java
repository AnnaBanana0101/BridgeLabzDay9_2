import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter power:");
        int n = sc.nextInt();

        if (n > 31 || n < 0) {
            System.out.println("Invalid");
            return;
        }

        System.out.println("\nPowers:");
        for (int i = 0; i <= n; i++) {
            int res = (int) Math.pow(2, i);
            System.out.println(res);
        }
    }
}
