import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello there");
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		Employee emp = new Employee(name);
		emp.calculateComission();
		sc.close();
	}

}
