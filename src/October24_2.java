public class October24_2 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("a value bedore tryToChange method is called: " + a);
        tryToChange(a);
        System.out.println("a value bedore tryToChange method is called: " + a);
        a=change(a);
        System.out.println("a value bedore cahnge method is called: " + a);
        int[] myArray = {1,2,3,4};
        for(int i=0;i<myArray.length;i++)
        {
            System.out.print(myArray[i] + " ");
        }
        changeArray(myArray);
        System.out.println("\nafter changeArray");
        for(int i=0;i<myArray.length;i++)
        {
            System.out.print(myArray[i] + " ");
        }
    }

    public static void changeArray(int[] arr) {
        arr[0] = 10;
    }

    public static void tryToChange(int b) {
        b=6;
    }
    public static int change(int b) {
        return 6;
    }
}
