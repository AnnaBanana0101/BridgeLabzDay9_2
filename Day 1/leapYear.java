import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");

        int year = input.nextInt();
        int count = 0;

        int temp = year;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        if (count < 4) {
            System.out.println("Invalid");
            return;
        }

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}