import java.util.Scanner;

public class Kilometer {
	private int kilometers;
	private int gas;
	private int sum = 0;
	private int totalKm = 0;
	
	public void travelConsumption() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("Travel consulting");
		System.out.println("***********************");
		
		System.out.print("How many travels you want to register? ");
		int travel = sc.nextInt();
		int sentinel = 0;
		while(sentinel < travel) {
			
			System.out.printf("%nPlease Enter you data%n");
			System.out.print("Kilometer: ");
			kilometers = sc.nextInt();
			System.out.print("Gas consumed (in liters): ");
			gas = sc.nextInt();
			System.out.printf("The consumption was: %.2f km/l%n%n", consumed());
			sum += gas;
			totalKm += kilometers;
			++sentinel;
		}
		System.out.println("************************************************");
		System.out.println("The Total gas used was: " + sum + " liters");
		System.out.println("The kilometers run was: " + totalKm + " Km");
		System.out.println("************************************************");
		sc.close();
	}
	
	public  double consumed() {
		return (double)kilometers/gas;
	}
	
	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	
	
	
	
	
}
