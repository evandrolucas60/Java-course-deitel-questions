import java.util.Scanner;

//a classe Account com um construtor que inicializa o nome e o balance.
//e m�todo deposit que executa a valida��o.

public class Account {
	private String name; // Vari�vel de inst�ncia
	private double balance; // Vari�vel de inst�ncia

	// construtor recebe dois par�metros
	public Account(String name, double balance) {
		this.name = name; // atribui name � vari�vel name

		// valida que o balance � maior que 0.0; se n�o for,
		// a vari�vel de inst�ncia balance mant�m seu valor inicial padr�o
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	//m�todo que deposita apenas uma quantia v�lida no saldo
	public void deposit (double depositAmount) {
		// se depositAmount for v�lido
		if (depositAmount > 0.0) {
			balance += depositAmount; //o adiciona ou saldo
		}
	}
	
	public void witdrawn(double amount) {
		if(amount <= balance) {
			this.balance -= amount;
		} else {
			System.out.println("No enough cash.");
		}
	}
	
	public void options() {
		Scanner in = new Scanner(System.in);
		System.out.print("please enter your name: ");
		String name = in.nextLine();
		if (name.contains(this.name)) {
			int options = 0;
			System.out.println();
			System.out.printf("Hello, %s%n%n", this.name);
			System.out.println("****************");
			System.out.println("OPTIONS");
			System.out.println("****************");
			System.out.println("1 - Deposit");
			System.out.println("2 - Withdraw");
			System.out.println("3 - Exit");
						
			do {
				System.out.println();
				System.out.print("Enter an option: ");
				int option1 = in.nextInt();
				options = option1;
				System.out.println();
				
				switch (options) {
				case 1:
					System.out.print("How much you want to doposit: ");
					double depositAmount = in.nextDouble();
					deposit(depositAmount);
					System.out.println("You deposit: $" + depositAmount );
					System.out.println("You new balance is: $" + getBalance());
					System.out.println();
					break;
				case 2:	
					System.out.print("Please enter the value to witdrawn :");
					double amount = in.nextDouble();
					witdrawn(amount);
					System.out.println("You witdrawn: $" + amount);
					System.out.println("Balance after witdrawn is: $" + getBalance());
					System.out.println();
					break;
				case 3:
					System.out.println("==================================");
					break;
				default:
					System.out.printf("Unexpected value: " + options);
				}
			} while(options != 3);
			
		}else {
			System.out.println("You don't have an account in this bank");
		}
		System.out.println("Thank you for banking with us!");
		System.out.println("==================================");
		System.out.println();
		
	}
	
	//m�todo retorna o saldo da conta
	public double getBalance() {
		return balance;
	}

	// m�todo para definir o nome
	public void setName(String name) {
		this.name = name;
	}

	// m�todo para recuperar o nome
	public String getName() {
		return name; //retorna o name ao chamador
	}

}// fim da classe Account
