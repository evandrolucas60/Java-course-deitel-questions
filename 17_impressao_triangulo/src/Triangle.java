import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter the n value: ");
		n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			
			for(int j = n - 1; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
