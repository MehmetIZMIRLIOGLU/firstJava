import java.util.Scanner;  // Import the Scanner class

class scannerExample {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter Number 1");
        Integer number1 = myObj.nextInt();  // Read user input

        System.out.println("Enter Number 2");
        Integer number2 = myObj2.nextInt();  // Read user input

        System.out.println("Total: " + (number1+number2));  // Output user input
        System.out.printf("Total: %s",(number1+number2));  // Output user input
    }
}