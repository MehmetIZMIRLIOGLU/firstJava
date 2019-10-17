public class October17_6 {
    public static void main(String[] args) {
        System.out.println(biggest(5,10));
        System.out.println(biggest(345,56));
        System.out.println(Math.max(345,345));
        System.out.println(Math.PI);
        System.out.println(Math.pow(2,3));
        System.out.println(Math.random());

        System.out.println("-----");

        boolean x = false;
        do {
            int random = (int) (Math.random() * 7);
            System.out.println(random);
            if(random==6)
                x=true;
        } while(x==false);
    }

    public static int biggest(int a, int b) {
        if(a>b)
            return a;
        else if(b>a)
            return b;
        else
            return a;
    }
}
