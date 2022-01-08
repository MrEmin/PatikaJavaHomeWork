import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0, max = 0, number;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int scan = input.nextInt();

        for (int i = 1; i <= scan; i++) {
            System.out.print(i + " . sayıyı giriniz : ");
            number = input.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            }

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);
    }
}
