import java.util.Scanner;

public class week5_lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        boolean prime=true;

        for (int i=2;i<num;i++)
        {
            if(num%i==0)
                prime=false;
        }

        // 1 is not prime number
        if(num==1)
            prime=false;

        if(prime == true)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not prime number");
    }
}
