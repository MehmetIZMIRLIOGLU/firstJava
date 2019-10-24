public class October24_3 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("-----");

        for (int x:a) {
            System.out.println(x);
        }

        System.out.println("-----");

        char[] alphabet = {'a','b','c'};

        // foreach
        // enhanced for
        for(char x:alphabet) {
            System.out.println(x);
        }
    }
}
