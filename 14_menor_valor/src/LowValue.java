import java.util.Scanner;

public class LowValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity = 0;
		int lowValue = 0;
		int number = 0;

		System.out.print("Enter the quantity of numbers that will be analyzed: ");
		quantity = sc.nextInt();

		for (int i = 1; i <= quantity; i++) {
			System.out.printf("%d# - Number: ", i);
			number = sc.nextInt();

			if (i == 1) {
				lowValue = number;
			}

			if (number < lowValue) {
				lowValue = number;
			}
		}
		System.out.println();
		System.out.printf("The most low value is: %d", lowValue);
		sc.close();
	}

}
