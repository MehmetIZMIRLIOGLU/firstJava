import java.util.Scanner;

public class class2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your weight as kg: ");
		double weight = sc.nextDouble();
		System.out.print("Enter your height as meter: ");
		double height = sc.nextDouble();
		
		/* bmi < 20 --> "You are thin." 20 <= bmi < 25--> "You are ordinary weighted." 25 <= bmi < 40 --> "You are obese. */
		double bmi = weight / (height*height);
		System.out.println("Your body mass index is " + bmi);
		if(bmi<20)
			System.out.println("You are thin.");
		else if(bmi>=20 && bmi<25)
			System.out.println("You are ordinary weighted.");
		else if(bmi>=25 && bmi<40)
			System.out.println("You are obese.");
	}
}
