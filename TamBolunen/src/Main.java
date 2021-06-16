import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, ort, total = 0, counter = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();

        for (int i = 0; i < k; i++){
            if (i % 3 == 0 && i % 4 == 0){
                total += i;
                counter++;
            }
        }
        ort = total / counter;
        System.out.println(k + " sayısına kadar olan sayıların 3'e ve 4'e tam bölünenlerin ortalaması : " + ort);
    }
}