import java.util.Scanner;

public class October24_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array
        System.out.print("enter the number of exams: ");
        int lenght = sc.nextInt();
        int grades[] = new int[lenght];
        int sum = 0;
        for(int i=0;i<grades.length;i++)
        {
            System.out.print("enter grade #" + (i+1) + ": ");
            grades[i] = sc.nextInt();
            sum += grades[i];
        }

        int average = sum/grades.length;

        System.out.println("sum: " + sum + " - average: " + average);

    }
}
