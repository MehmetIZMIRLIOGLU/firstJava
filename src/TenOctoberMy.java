import java.util.Scanner;

public class TenOctoberMy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Diktörtgenin Bir Köşesinin Uzunluğunu Yazınız:");
        Integer kose1 = sc.nextInt();
        System.out.printf("Diktörtgenin Diğer Köşesinin Uzunluğunu Yazınız:");
        Integer kose2 = sc.nextInt();

        double kosegen = Math.sqrt((Math.pow(kose1,2) + Math.pow(kose2,2)));

        System.out.printf("________________\n|              |\n|              |\n|              |\n|______________|");
        System.out.println("\n\n- Dikdörtgenin Bilgileri -\nÇevresi: " + ((kose1*2)+(kose2*2)) + "\nAlanı: " + (kose1*kose2) + "\nKöşegen Uzunluğu:" + kosegen);
    }
}
