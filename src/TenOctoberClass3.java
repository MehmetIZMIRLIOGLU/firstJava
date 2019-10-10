public class TenOctoberClass3 {
    public static void main(String[] args) {
        int num = 100;

        while(num>0)
        {
            if(num%7 == 0)
                System.out.println(num + " is divisible by 7");
            else
                System.out.println(num + " is not divisible by 7");
            num--;
        }

        num = 1;

        // 7'ye bölünmüyorsa döngüye geri dön.
        do {
            num++;
        } while(num%7!=0);
        // num%7==0
        System.out.println(num);
    }
}
