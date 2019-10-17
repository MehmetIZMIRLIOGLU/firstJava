public class October17_3 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++) {
            countTo(i);
        }
        System.out.println("----");
        for(int i=50;i>0;i--) {
            countTo(i);
        }
    }

    public static void countTo(int x) {
        for(int i=1;i<=x;i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //System.out.println(x);
    }
}
