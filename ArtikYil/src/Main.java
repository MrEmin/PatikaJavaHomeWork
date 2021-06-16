import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        boolean artikYil = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

        if ((year % 100 == 0) && (year % 400 == 0)){
            artikYil = true;
        }else if ((year % 4 == 0) && (year % 100 != 0)){
            artikYil = true;
        }

        if (artikYil){
            System.out.println(year + " bir artık yıldır !");
        }else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }
}
