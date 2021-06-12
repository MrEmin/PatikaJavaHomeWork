import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplamTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextDouble();

        toplamTutar = ((armut * armutKg) + (elma * elmaKg) + (domates*domatesKg)
        + (muz * muzKg) + (patlican * patlicanKg));

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
