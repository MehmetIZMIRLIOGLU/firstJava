public class October17_4 {
    public static void main(String[] args) {
        int result = method1();
        System.out.println(result);
        int sum = Add(5,4);
        System.out.println(sum);
        double sum2 = Add(5.4,4.5);
        System.out.println(sum2);
        double sum3 = Add(5.4,4);
        System.out.println(sum3);
        System.out.println("---");
        System.out.println(isPrime(67));
        System.out.println((isPrime(8) ? "is prime" : "not prime"));
        System.out.println((isPrime(2) ? "is prime" : "not prime"));
    }

    public static int method1() {
        return 5;
    }

    public static int Add(int a, int b) {
        return a+b;
    }
    // method overloading
    public static double Add(double a, double b) {
        return a+b;
    }
    public static double Add(double a, int b) {
        return a+b;
    }

    //decide if a number prime or not
    public static boolean isPrime(int num) {
        for(int i=2; i<num; i++)
        {
            if(num%i==0)
                return false;
        }
        // 1 is not prime number
        if(num == 1)
            return false;

        return true;
    }
}
