import java.util.Scanner;

public class CrediteLimitTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("********************************************************");
		System.out.println("Welcome to theCredit you system of credit online");
		System.out.println("********************************************************");
		System.out.println();
		
		System.out.print("please, Enter you account number: ");
		int account = sc.nextInt();
		System.out.print("Now, enter with your balance in this month: ");
		double balance = sc.nextDouble();
		System.out.print("Alright, now tell us how much is your debt: ");
		double debt = sc.nextDouble();
		System.out.print("What is your credit limit: ");
		double credit = sc.nextDouble();
		CrediteLimit cl = new CrediteLimit(account, balance, debt, credit);
		if (cl.newBalance() > cl.creditAvaliable()) {
			System.out.println("Exceeded credit limit");			
		}else {
			System.out.println("Nice, you have enough credit");
		}
		
		
		
		sc.close();
	}

}
