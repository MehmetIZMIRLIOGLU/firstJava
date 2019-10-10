import java.util.Scanner;

public class TenOctoberClass2 {
    public static void main(String[] args) {
        int num = 1;
        int lastNum = 10;

        System.out.println("All Numbers:");

        while(num<=lastNum)
            System.out.println(num++);

        System.out.println("---------\nEven Numbers:");

        for(int i=1;i<=lastNum;i++)
        {
            if(i%2 == 0)
                System.out.println(i);
        }

        System.out.println("---------\nOdd Numbers:");

        for(int i=1;i<=lastNum;i++)
        {
            if(i%2 == 1)
                System.out.println(i);
        }
    }
}
