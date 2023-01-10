import java.util.Scanner;

public class Cryptography {
	public static void main(String[] args) {
		
		int num, qua, ter, seg, pri, aux, aux2;
		
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
		// cálculos para a criptografia
		// adição de 7
		qua = qua + 7;
		ter = ter + 7;
		seg = seg + 7;
		pri = pri + 7;
		// resto da divisão por 10
		qua = qua % 10;
		ter = ter % 10;
		seg = seg % 10;
		pri = pri % 10;
		// inversões dos números
		aux = 0;
		aux2 = 0;
		aux = qua;
		qua = seg;
		seg = aux;
		aux2 = ter;
		ter = pri;
		pri = aux2;
		// Impressão do dígito Criptografado
		System.out.printf("The cryptograpy is: %d%d%d%d", pri, seg, ter, qua);
		sc.close();
	}
}
