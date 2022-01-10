import java.util.Scanner;

public class Main {
    static void isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10; //Son basamağı almak için.
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10; //Son basamağı silmek için.
        }
        if (number == reverseNumber)
            System.out.println(number + " sayısı palindrom sayıdır");
        else
            System.out.println(number + " sayısı palindrom sayı değildir");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();
        isPalindrom(number);
    }
}