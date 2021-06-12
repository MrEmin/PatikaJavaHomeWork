import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double cevre, alan, u;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        a= input.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        b= input.nextInt();

        System.out.print("3. Kenarı Giriniz : ");
        c= input.nextInt();

        cevre = a + b + c;
        u = cevre / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı : " + alan);
    }
}