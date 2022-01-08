import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n = input.nextInt();
        double result = 0;

        // Java, int değeri int değere böldüğü zaman sonucu int yapıyor.
        // O yüzden 2 harmonik sayısını 1.5  değilde 1 olarak çıkarıyor.
        // Bunun önüne geçmek için double i veye 1.0/i işlem yapmalıyız.
        for (int i = 1; i <= n; i++) {
            result += (1.0/i);
        }
        System.out.println(result);

    }
}
