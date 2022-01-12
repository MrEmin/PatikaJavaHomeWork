import java.util.Scanner;

public class Main {
    // Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
    //
    //Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
    // Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
    // Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

    static void decrease(int number, int temp) {
        if (number > 0) {
            System.out.print(number + "  ");
            decrease(number-5, temp);
        } else {
            increase(number, temp);
        }
    }

    static void increase(int number, int temp) {
        System.out.print(number + "  ");
        if (number == temp) {
            return;
        }
        number += 5;
        increase(number, temp);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int number = scan.nextInt();
        int temp = number;
        decrease(number, temp);

    }
}