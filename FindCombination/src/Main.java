import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //
        //Java ile kombinasyon hesaplayan program yazınız.
        //
        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)

        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısını Giriniz : ");
        int n = scan.nextInt();

        System.out.print("r Sayısını Giriniz : ");
        int r = scan.nextInt();

        int i = 1, nTotal = 1, rTotal = 1, xTotal = 1;

        for (i = 1; i <= n; i++){
            nTotal *= i;
        }

        for (i = 1; i <= r; i++){
            rTotal *= i;
        }

        for (i = 1; i <= (n - r); i++){
            xTotal *= i;
        }

        int result = nTotal / (rTotal * (xTotal));

        System.out.println("Kombinasyon Sonucu: " + result);
    }
}
