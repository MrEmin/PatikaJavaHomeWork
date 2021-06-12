import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvOran1 = 0.08, kdvliTutar, kdv, kdv1;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı Giriniz : ");
        tutar = input.nextDouble();

        kdv = tutar * kdvOran;
        kdv1 = tutar * kdvOran1;

        kdvliTutar = (tutar<=1000)? (tutar + kdv) : (tutar + kdv1);

        System.out.println("KDV'siz Tutar : " + tutar + " TL");
        System.out.println("KDV'li Tutar : " + kdvliTutar + " TL");
    }
}
