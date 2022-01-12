import java.util.Scanner;

public class Main {

    static int power(int base, int powerValue) {
        if (powerValue != 0) {
            return (base * power(base, powerValue - 1)); //recursive method
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int base = scan.nextInt();

        System.out.print("Kuvvet değerini giriniz: ");
        int powerValue = scan.nextInt();

        int result = power(base, powerValue);
        System.out.println(base + " ^ " + powerValue + " = " + result);

    }
}