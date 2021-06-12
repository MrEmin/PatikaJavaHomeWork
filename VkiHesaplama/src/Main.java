import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kg;
        double boy, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextInt();

        vki = (kg / (boy * boy));

        System.out.println("Vücut Kitle İndeksiniz : " + vki);
    }
}
