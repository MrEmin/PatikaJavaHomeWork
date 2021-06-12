import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = input.nextInt();

        System.out.print("Alfa değerini giriniz : ");
        a = input.nextInt();

        alan = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin Alanı : " + alan);

    }
}
