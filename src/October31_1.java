public class October31_1 {
    public static void main(String[] args) {
        // boolean
        int i=5;
        double d=5.6;
        boolean b=true;
        System.out.println(b);
        b=i>d;
        System.out.println(b);
        if(b==true)
            System.out.println("yes");
        else
            System.out.println("no");

        System.out.println(true?"correct":"wrong");
        System.out.println(b?"yes":"no");
        System.out.println(i>d?"yes":"no");

        // char (one character)
        char c='a';
        char g='1';
        String s="1";
    }
}
