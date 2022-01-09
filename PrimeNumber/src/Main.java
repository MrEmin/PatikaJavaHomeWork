import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 100: ");
        System.out.println("=====================================");
        for (int i = 2; i < 100; i++) {
            boolean prime = true;
            for (int number = 2; number < i; number++) {
                if (i % number == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
    }
}
