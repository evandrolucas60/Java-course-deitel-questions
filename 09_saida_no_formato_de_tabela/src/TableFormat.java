import java.util.Scanner;

public class TableFormat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many lines you want in the table: ");
		int lines = sc.nextInt();
		int num = 1;
		System.out.printf("%nN\t10*N\t100*N\t1000*N%n%n");
		while (num <= lines) {
			System.out.printf("%d\t", num);
			System.out.printf("%d\t", num * 10);
			System.out.printf("%d\t", num * 100);
			System.out.printf("%d\t%n", num * 1000);
			num++;
		}
		sc.close();
	}

}
