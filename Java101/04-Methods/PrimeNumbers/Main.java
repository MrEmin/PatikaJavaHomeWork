import java.util.Scanner;

public class Main {

    static boolean prime(int number, int i) {
        if (i < number) {
            if (number % i != 0)
                return (prime(number, ++i)); // recursive method.
            else
                return false;
        }
        return number > 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int number = scan.nextInt();

        if (prime(number, 2))
            System.out.println(number + " asal sayıdır ");
        else
            System.out.println(number + " asal sayı değildir ");
    }
}