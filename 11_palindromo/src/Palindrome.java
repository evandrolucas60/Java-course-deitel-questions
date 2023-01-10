import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int flag;
		int a, b, c, d, e;

		num = 0;
		flag = 1;

		while (flag == 1) {
			System.out.print("Enter a integer number with 5 digits: ");
			num = sc.nextInt();

			if (num <= 10000 || num >= 99999) {
				System.out.println("Error. The number must have 5 digits");
			} else {
				flag = 2;
			}
		}

		a = num / 1000;
		b = (num / 1000) % 10;
		c = (num / 100) % 10;
		d = (num / 10) % 10;
		e = num % 10;

		System.out.printf("%d %d %d %d %d\n", a, b, c, d, e);

		if (a == e && b == d) {
			System.out.printf("%d é um palíndromo!%n", num);
		} else {
			System.out.printf("%d não é um palíndromo!\n", num);
		}
	}

}
