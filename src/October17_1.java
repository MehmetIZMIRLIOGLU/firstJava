public class October17_1 {
    public static void main(String[] args) {
        int n=0;
        n+=1;
        System.out.println(n);//1
        n++;
        System.out.println(n);//2
        ++n;
        System.out.println(n);//3

        System.out.println(n++);//3 (but n increase) post inc.
        System.out.println(n);//4

        System.out.println(++n);//5 pre inc.
        System.out.println(n);//5

        System.out.println("-1-");

        int b=2*n++;//2*5 (after n=6)

        System.out.println("B:"+b);//2*5=10
        System.out.println("N:"+n);//6

        System.out.println("-2-");

        b=2*++n;//2*7

        System.out.println("B:"+b);//2*7=14
        System.out.println("N:"+n);//7

        System.out.println("-3-");

        System.out.println(n++ + ++n);// 7 + 9 = 16
        System.out.println(++n + n++);// 10 + 10 = 20

        System.out.println("-4-");

        n/=2;
        System.out.println(n);//n/2=5

        n*=5;
        System.out.println(n);//n*5=25
    }
}
