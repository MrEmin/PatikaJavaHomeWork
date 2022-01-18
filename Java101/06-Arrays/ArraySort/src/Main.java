import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int counter = scan.nextInt();
        int number;
        int[] list = new int[counter];

        for (int i = 0; i < counter; i++) {
            System.out.print(i+1 + ". sayıyı giriniz: ");
            number = scan.nextInt();
            list[i] = number;
        }

        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }
}