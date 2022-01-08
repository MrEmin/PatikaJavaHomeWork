import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz : ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int m = (2 * i) - 1; m >= 1; m--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
