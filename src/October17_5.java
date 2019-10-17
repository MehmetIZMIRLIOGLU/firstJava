public class October17_5 {
    public static void main(String[] args) {
        // bigger than 5 and 5 are not exist
        for (int i=0;i<10;i++) {
            if(i==5)
                break;
            System.out.println(i);
        }
        System.out.println("---");
        // 5 is not exist
        for (int i=0;i<10;i++) {
            if(i==5)
                continue;
            System.out.println(i);
        }
    }
}
