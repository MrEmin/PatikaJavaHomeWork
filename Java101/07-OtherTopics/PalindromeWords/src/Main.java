import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        str = str.replace(" ", "").toLowerCase();
        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return str.equals(reverse.toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String word = scan.nextLine();

        if (isPalindrome(word))
            System.out.println(word + " kelimesi palindromdur.");
        else
            System.out.println(word + " kelimesi palindrom değildir.");
    }
}