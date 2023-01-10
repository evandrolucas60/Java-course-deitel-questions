package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double height = 0, weight = 0;
		double imc;
		
		System.out.println("*****************");
		System.out.println("IMC - Calculator");
		System.out.println("*****************");
		System.out.println();
		System.out.print("Enter your weight(Kg): ");
		weight = sc.nextDouble();
		System.out.print("Enter yor height(m): ");
		height = sc.nextDouble();
		imc = weight / (height * height);
		System.out.printf("Your IMC is: %.2f%n", imc);
		
		if (imc < 18.5) {
			System.out.print("You are: Underweight");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.print("You are: Normal");
		}else if (imc >= 25 && imc <= 29.9 ) {
			System.out.print("You are: Overweight");
		}else {
			System.out.print("You are: Obese");
		}
		sc.close();
	}

}
