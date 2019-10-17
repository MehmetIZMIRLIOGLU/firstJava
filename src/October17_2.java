public class October17_2 {
    public static void main(String[] args) {
        printStarts();
        System.out.println("\n----");
        printStartsWithNumber(100);
    }

    public static void printStarts() {
        for(int i=0;i<75;i++) {
            System.out.print("*");
        }
    }

    //method declaration
    public static void printStartsWithNumber(Integer num) {
        //method body
        for(int i=0;i<num;i++) {
            System.out.print("*");
        }
    }
}
