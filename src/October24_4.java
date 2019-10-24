import java.util.Random;
import java.util.Scanner;

public class October24_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Preference (1->Manually, 2->Machine): ");
        int pref = sc.nextInt();
        if(pref == 1) {
            int ticket[] = myGenerateManually();
            for(int x:ticket) {
                System.out.print(x + " ");
            }
        } else if(pref == 2) {
            int ticket[] =  myGenerateByMachine();
            for(int x:ticket) {
                System.out.print(x + " ");
            }
        } else {
            System.out.println("Error! Please try again.");
        }
    }

    public static boolean contains(int[] arr, int a) {
        boolean ret = false;
        for(int x:arr) {
            if(x==a)
                ret = true;
        }
        return ret;
    }

    public static int[] myGenerateManually() {
        Scanner sc = new Scanner(System.in);
        int[] ticket = new int[6];
        int num;
        for(int i=1;i<=6;i++) {
            System.out.print("Enter Number #" + i + ": ");
            num = sc.nextInt();
            if(contains(ticket,num) || !(num>0 && num<50))
            {
                i--;
                continue;
            } else
                ticket[(i-1)] = num;
        }

        return ticket;
    }

    public static int[] myGenerateByMachine() {
        Random r = new Random();
        int[] ticket = new int[6];
        int rr;
        for(int i=1;i<=6;i++) {
            rr = r.nextInt(49)+1;
            if(contains(ticket,rr))
            {
                i--;
                continue;
            } else
                ticket[(i-1)] = rr;
        }

        return ticket;
    }
}
