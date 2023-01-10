import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****************");
		System.out.println("FACTORIAL");
		System.out.println("****************");
		
		System.out.print("Enter a integer number (with number > 0): ");
		int number = sc.nextInt();
		while(number < 0) {
			System.out.println("Invalid Value, try again");
			System.out.print("Enter a integer number (with number > 0): ");
			number = sc.nextInt();
		}
		int counter = number;
		int factorial = 1;
		while(counter >= 1) {
			factorial *= counter; 
			counter--;
		}
		System.out.printf("%d! = %d", number, factorial);
		sc.close();
	}

}
