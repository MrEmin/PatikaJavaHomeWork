import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, total = 0, dersSayisi = 0;
        double avarege;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        total += (mat <= 100 && mat >= 0) ? mat : 0;
        dersSayisi += (mat <= 100 && mat >= 0) ? 1 : 0;

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        total += (fizik <= 100 && fizik >= 0) ? fizik : 0;
        dersSayisi += (fizik <= 100 && fizik >= 0) ? 1 : 0;

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        total += (kimya <= 100 && kimya >= 0) ? kimya : 0;
        dersSayisi += (kimya <= 100 && kimya >= 0) ? 1 : 0;

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        total += (turkce <= 100 && turkce >= 0) ? turkce : 0;
        dersSayisi += (turkce <= 100 && turkce >= 0) ? 1 : 0;

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();
        total += (muzik <= 100 && muzik >= 0) ? muzik : 0;
        dersSayisi += (muzik <= 100 && muzik >= 0) ? 1 : 0;

        avarege = total / dersSayisi;

        if (avarege >=55){
            System.out.println("Tebrikler, sınıfı geçtiniz.");
        }else{
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız : " + avarege);

    }
}
