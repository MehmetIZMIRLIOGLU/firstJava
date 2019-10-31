import java.util.Random;

public class October31_2 {

    //roll a dice 100 times
    //count how many times we rolled 1,2,3,4,5,6
    public static void main(String[] args) {
        Random rand=new Random();
        int num;
        num = rand.nextInt();
        num = rand.nextInt(5); // 0-4 (5 is not inc)
        num = rand.nextInt(12); // 0-11
        num = rand.nextInt(6); // 0-5
        num = rand.nextInt(6)+1; // 1-6

        int dice;
        int count[]=new int[7];
        for (int i=0;i<30;i++) {
            dice = rand.nextInt(6)+1;
            count[dice]++;
        }

        System.out.println("Dice\tCount\tChart");
        for(int ii=1;ii<count.length;ii++) {
            System.out.print(ii+"\t\t"+count[ii]+"\t\t");
            for (int iii=1;iii<=count[ii];iii++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
