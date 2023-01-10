//usando o construtor de Account para inicializar as instâncias name e balance
//variável no momento em que cada objeto Account é criado

public class AccountTest {

	public static void main(String[] args) {
		// cria dois objetos Account
		
		Account acc1 = new Account("Jane Green", 50.00);
		Account acc2 = new Account("John Blue", -7.53);

		// exibe o valor inicial de cada objeto Account
		System.out.println("Avaliable accounts: ");
		System.out.printf("%s balance: $%.2f %n", acc1.getName(), acc1.getBalance());
		System.out.printf("%s balance: $%.2f %n", acc2.getName(), acc2.getBalance());
		System.out.println();

		
		acc1.options();
		
		acc2.options();
	}
}// fim da classe AccountTest
