
public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("***************");
		System.out.println("Fatorial");
		System.out.println("***************");
		
		long  number = 1;
		int counter = 20;
		
		while(counter >= 1) {
			number*= counter;
			counter--;
		}
		
		System.out.printf("%n20! is: %d", number);
	}

}
