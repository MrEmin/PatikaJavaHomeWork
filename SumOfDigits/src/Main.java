import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = input.nextInt();
        int digitValue, total = 0;

        while (number != 0) {
            digitValue = number % 10;
            total += digitValue;
            number /= 10;
        }
        System.out.println("Total Value = " + total);

    }
}
