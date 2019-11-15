import java.util.*;

public class week9lab1 {

    public static void main(String[] args) {
        int lottery[] = new int[6];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        generateLottery(lottery);
        System.out.print("Enter 6 numbers: ");
        int myLottery[] = new int[6];
        boolean t=true;
        boolean a=true;
        int i = 0;
        int num;
        do {
            num=sc.nextInt();
            a=true;
            for (int x:myLottery) {
                if(x==(num))
                    a=false;
            }
            if(a==false) {
                t = true;
            } else {
                myLottery[i] = (num);
                i++;
                if(i==6)
                    t=false;
                else
                    t=true;
            }
        } while(t==true);
        System.out.println("Lucky numbers are: ");
        for (int x:
             lottery) {
            System.out.print(x+" ");
        }
        System.out.println();
        checker(lottery,myLottery);
    }

    public static void checker(int[] lottery, int[] myLottery)
    {
        int i=0;
        for (int x:
             lottery) {
            for (int y:
                 myLottery) {
                if(x==y)
                    i++;
            }
        }
        System.out.println(i + " number matched.");
    }

    public static void generateLottery(int[] lottery)
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        boolean t=true;
        boolean a=true;
        int i = 0;
        int num;
        do {
            num=r.nextInt(49)+1;
            a=true;
            for (int x:lottery) {
                if(x==num)
                    a=false;
            }
            if(a==false) {
                t = true;
            } else {
                lottery[i] = num;
                i++;
                if(i==6)
                    t=false;
                else
                    t=true;
            }
        } while(t==true);
    }
}
