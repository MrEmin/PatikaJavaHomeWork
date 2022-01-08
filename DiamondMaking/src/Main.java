import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i == n) {
                for (int l = (n-1); l >= 1; l--) {
                    for (int m = 1; m <= n-l; m++) {
                        System.out.print(" ");
                    }
                    for (int x = (2 * (l+1)) - 3; x >= 1; x-- ) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }


    }
}
