import java.util.Scanner;

public class Descryptography {

	public static void main(String[] args) {
		
		int num, pri, seg, ter, qua, aux, aux2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a four digits number: ");
		num = sc.nextInt();
		
		while(num < 1000 || num > 9999) {
			System.out.println("Invalid number, try again");
			System.out.println("Enter a four digits number: ");
			num = sc.nextInt();
		}
		
		// separação dos dígitos do inteiro
		qua = num % 10;
		num = num / 10;
		ter = num % 10;
		num = num / 10;
		seg = num % 10;
		num = num / 10;
		pri = num % 10;
		// inversões dos números
		aux = 0;
		aux2 = 0;
		aux = qua;
		qua = seg;
		seg = aux;
		aux2 = ter;
		ter = pri;
		pri = aux2;
		// cálculos para a descriptografia
		pri = (pri + 10) - 7;
		seg = (seg + 10) - 7;
		ter = (ter + 10) - 7;
		qua = (qua + 10) - 7;
		// Impressão do dígito Descriptografado
		System.out.printf("The descryptograpy is: %d%d%d%d", pri, seg, ter, qua);
		sc.close();
	}

}
