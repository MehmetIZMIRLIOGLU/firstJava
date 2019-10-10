import java.util.Scanner;

public class TenOctoberClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hesap Makinesine Hoş Geldiniz");
        System.out.println("-------------");
        System.out.print("İlk Sayıyı Giriniz: ");
        Integer num1 = sc.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        Integer num2 = sc.nextInt();

        System.out.println("Hangi İşlemi Yapmak İstiyorsunuz?");
        System.out.println("1 -> Toplama");
        System.out.println("2 -> Çıkarma");
        System.out.println("3 -> Çarpma");
        System.out.println("4 -> Bölme");
        System.out.println("5 -> Bölüm Kalanını Bulma");

        Integer progressNum = sc.nextInt();

        // If ile Yapılmış Bir Örnek
        if(progressNum == 1)
            System.out.println("İşlem Sonucu: " + (num1+num2));
        else if(progressNum == 2)
            System.out.println("İşlem Sonucu: " + (num1-num2));
        else if(progressNum == 3)
            System.out.println("İşlem Sonucu: " + (num1*num2));
        else if(progressNum == 4)
            System.out.println("İşlem Sonucu: " + (num1/num2));
        else if(progressNum == 5)
            System.out.println("İşlem Sonucu: " + (num1%num2));
        else {
            System.out.println("Hatalı İşlem Numarası Girdiniz! Tekrar Deneyiniz");
        }

        // Switch-Case ile Yapılmış Bir Örnek
        switch (progressNum) {
            case 1:
                System.out.println("İşlem Sonucu: " + (num1+num2));
                break;
            case 2:
                System.out.println("İşlem Sonucu: " + (num1-num2));
                break;
            case 3:
                System.out.println("İşlem Sonucu: " + (num1*num2));
                break;
            case 4:
                System.out.println("İşlem Sonucu: " + (num1/num2));
                break;
            case 5:
                System.out.println("İşlem Sonucu: " + (num1%num2));
                break;
            default:
                System.out.println("Hatalı İşlem Numarası Girdiniz! Tekrar Deneyiniz");
                break;
        }
    }
}
