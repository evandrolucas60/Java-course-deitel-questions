package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print(" Digite o numero do tamanho do quadrado de 1 a 20 :");
	        int q = input.nextInt();

	        for (int a = 1; a <= q; a++) {
	            System.out.print("*");
	        }

	        for (int a = 1; a <= q - 2; a++) {
	            System.out.print("\n*");

	            for( int c = 1; c < q - 1; c++ )
	            {
	             System.out.print(" ");
	            
	            }

	            System.out.print("*\n");
	        }

	        for (int a = 1; a <= q; a++) {
	            System.out.print("*");
	        }

	}

}
