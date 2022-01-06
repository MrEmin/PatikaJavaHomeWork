import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz : ");
        n = scan.nextInt();

        for (int i = 1, j = 1; i <= n && j <= n; i *= 4, j *= 5){
            System.out.println("4'ün Kuvveti : " + i);
            System.out.println("5'in Kuvveti : " + j);
        }

    }
}
