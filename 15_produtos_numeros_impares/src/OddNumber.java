
public class OddNumber {

	public static void main(String[] args) {
		long number = 1;
		int counter = 1;
		while(counter <=15) {
			number *= counter;
			counter +=2;
		}
		System.out.printf("Result: %d", number);
	}

}
