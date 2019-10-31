import java.util.Scanner;

public class October31_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("give me a dimension");
            int rows = sc.nextInt();
            if(rows<1)
                break;
            drawShape(rows);
        }
        System.out.println("program ended");
    }

    public static void drawShape(int dimension) {
        int space = 0;
        int spacex;
        for (int i=dimension;i>0;i--) {
            spacex=1;
            for(int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
            for (int ii=i;ii>0;ii--) {
                System.out.print(ii);
                if(ii>=1000)
                    spacex=4;
                if(ii>=100 && spacex==1)
                    spacex=3;
                if(ii>=10 && spacex==1)
                    spacex=2;
            }
            space+=spacex;
            System.out.println();
        }
    }
}
