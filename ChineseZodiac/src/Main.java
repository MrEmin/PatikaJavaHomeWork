import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        String animal = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        year = input.nextInt();

        switch (year % 12){
            case 0 -> animal = "Maymun";
            case 1 -> animal = "Horoz";
            case 2 -> animal = "Köpek";
            case 3 -> animal = "Domuz";
            case 4 -> animal = "Fare";
            case 5 -> animal = "Öküz";
            case 6 -> animal = "Kaplan";
            case 7 -> animal = "Tavşan";
            case 8 -> animal = "Ejderha";
            case 9 -> animal = "Yılan";
            case 10 -> animal = "At";
            case 11 -> animal = "Koyun";
            default -> System.out.println("");
        }
        System.out.println("Çin Zodyağı Burcunuz : " + animal);
    }
}
