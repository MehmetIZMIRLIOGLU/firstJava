import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter short edge: ");
		int shortEdge = sc.nextInt();
		System.out.print("Enter long edge: ");
		int longEdge = sc.nextInt();
		
		System.out.println("-----------");
		System.out.println("Long edge = " + longEdge);
		System.out.println("Short edge = " + shortEdge);
		System.out.println("Area = " + (longEdge*shortEdge));
		System.out.println("Perimeter = " + ((longEdge+shortEdge)*2));
	}
}
