import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Fibonacci numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int x = input.nextInt();
        int a, b = 1, result = 0;

        for (int i = 0; i < x; i++) {
            a = b;
            b = result;
            result = a + b;

            System.out.println(result);
        }
    }
}
