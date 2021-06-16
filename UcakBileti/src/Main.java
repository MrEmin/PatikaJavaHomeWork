import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age, type, km;
        double pricePerKm = 0.1, ticket;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        type = input.nextInt();

        if (km > 0 && age > 0 && (type == 1 || type == 2)){
            ticket = pricePerKm * km;

            if (age < 12){
                ticket *= 0.5;
            }else if (age <= 24){
                ticket *= 0.9;
            }else if (age > 65){
                ticket *= 0.7;
            }

            if (type == 2) {
                ticket = 2*(ticket*0.8);
            }
            System.out.println("Toplam Tutar = " + ticket + " TL");


        } else System.out.println("Hatalı veri girdiniz !");

    }
}
