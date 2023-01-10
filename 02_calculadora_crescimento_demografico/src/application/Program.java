package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int bilion = 8;
		double populationGrowth =  0.011;
		
		System.out.println("*****************");
		System.out.println("Population Growth - Calculator");
		System.out.println("*****************");
		
		System.out.println("The total population today is: " +  bilion + "bilion");
		System.out.printf("The population growth anual tax is: %.3f %n", populationGrowth);
		
		System.out.println();
		System.out.print("How many years do you need to caculate? "); //prompt
		int years = sc.nextInt();
		
		double populationGrowthPrediction = bilion + (years * (bilion * populationGrowth));
		
		System.out.println();
		System.out.println("*****************************************************");
		System.out.printf("The population in %d years will be: ", years);
		System.out.printf("%.2f bilions%n" ,populationGrowthPrediction);
		System.out.println("*****************************************************");
		
		sc.close();
	}

}
