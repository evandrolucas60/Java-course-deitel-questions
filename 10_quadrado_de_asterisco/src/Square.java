import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the side of the square(min: 1, max 20): ");
		int squareSide = sc.nextInt();
		
		while(squareSide < 0 || squareSide > 20 ) {
			System.out.printf("Value invalid, try again%n");
			System.out.print("Enter the size of the side of the square(min: 1, max 20): ");
			squareSide = sc.nextInt();
		}
		int counter = 1;
		
		while (counter <= squareSide) {
			System.out.printf("*");
			counter++;
		}
		
		counter = 1;
		while (counter <= squareSide -2) {
			int c = 1;
			System.out.printf("%n*");
			
			while(c <= squareSide - 2) {
				System.out.print(" ");
				c++;
			}
			
			System.out.printf("*");
			counter++;
		}
		
		System.out.println();
		counter = 1;
		while (counter <= squareSide) {
			System.out.printf("*");
			counter++;
		}
		sc.close();
	}

}
