import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika")  && password.equals("java123")){
            System.out.println("Başarıyla Giriş Yaptınız !");
        }else{
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi sıfırlamak isterseniz 2'ye basın?");
            select = input.nextLine();

            if (select.equals("2")){
                System.out.print("Yeni şifrenizi giriniz : ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}
