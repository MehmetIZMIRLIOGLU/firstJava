public class TenOctoberClass4 {
    public static void main(String[] args) {
        int num = 1;
        boolean condition = true;

        // It can not stop because condition is true.
        /*while(condition)
        {
            System.out.println(num);
            num++;
        }*/

        while(condition)
        {
            System.out.println(num);
            num++;

            // If num is bigger than 100, while will stop
            if(num>100)
                condition=false;
        }
    }
}
