import java.security.SecureRandom;
import java.util.Scanner;

public class Aritmetics {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***********************");
		System.out.println("Welcome to Aritimetics");
		System.out.println("***********************");
		System.out.println();
		
		System.out.println("Do you wanna play");
		char yesOrNo = sc.next().charAt(0);
		
		if (yesOrNo == 'y'){
			
			System.out.println("***Let's Pratice***");
			for (int i=1; i<=10;++i) {
				
				int num = 1 + randomNumbers.nextInt(10);
				int num2 = 1 + randomNumbers.nextInt(10);
				System.out.printf("%d x %d = ",num, num2);
				int answer = sc.nextInt();
				int mult = num * num2;
				if (answer == mult) {
					System.out.println("correct");
				}else {
					System.out.println("Incorrect");
				}
				System.out.println();
			}
		
		}

		sc.close();
	}

}
