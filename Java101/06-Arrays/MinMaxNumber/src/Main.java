import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();
        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for (int j : list) {
            if (number < j) {
                max = j;
                break;
            }
        }

        for (int i = list.length-1; i >= 0; i--) {
            if (number > list[i]) {
                min = list[i];
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }
}