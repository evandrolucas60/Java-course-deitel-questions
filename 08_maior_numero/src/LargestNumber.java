import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int counter = 0;
		int largest = 0;
		int[] mat = new int[10];
		
		while(counter < 10) {
			
			System.out.printf("Enter a number %d#: ", counter + 1);
			int number = sc.nextInt();
			
			if(number > largest) {
				largest = number;
			}
			mat[counter] = (number);
			counter++;
		}
		
		System.out.println();
		System.out.println("List of number: ");
		System.out.println(Arrays.toString(mat));
		System.out.printf("The largest number is: %d%n", largest);
			
		sc.close();
	}
}
