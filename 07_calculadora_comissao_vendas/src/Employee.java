import java.util.Scanner;

public class Employee {
	private String name;
	private int numSeller;
	private double value;
	private double sumProducts;
	private double paycheck = 200;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void calculateComission() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%nHello, %s%n", this.name);
		System.out.print("How many seller you do this week: ");
		numSeller = sc.nextInt();
		int counter = 0;
		while(counter < numSeller) {
			System.out.println("****************");
			System.out.printf("%d# seller%n", counter+1);
			System.out.println("****************");
			System.out.print("Value: ");
			value = sc.nextDouble();
			sumProducts+=value;
			System.out.println();
			counter++;
		}
		System.out.printf("The value total of seller was: %.2f%n", sumProducts );
		System.out.printf("You comission is: %.2f%n", comission(sumProducts));
		System.out.printf("You regular payment is: %.2f%n", paycheck);
		System.out.printf("The total of money you earn this week is: %.2f", paycheck + comission(sumProducts));
		sc.close();
	}
	
	
	public double comission(double sum) {
		return sumProducts * 0.09; 
	}	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public int getNumSeller() {
		return numSeller;
	}
	public void setNumSeller(int numSeller) {
		this.numSeller = numSeller;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getSumProducts() {
		return sumProducts;
	}
	public void setSumProducts(double sumProducts) {
		this.sumProducts = sumProducts;
	}
	
	
}
