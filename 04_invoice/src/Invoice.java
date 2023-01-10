import java.util.Scanner;

public class Invoice {

	private String numInvoice;
	private String description;
	private int quantity;
	private double price;
	private int invoiceLegth = 10;

	// construtor
	public Invoice() {

	}

	public void products() {

		System.out.println("**************************");
		System.out.println("Products on sale");
		System.out.println("**************************");
		System.out.println();

		System.out.println("***Products***");
		System.out.println();
		System.out.println("1 - PC Gaming");
		System.out.println("2 - Laptop");
		System.out.println("3 - Cellphone");
		System.out.println("4 - Tv Smart 8k");
		System.out.println("5 - Exit");
		System.out.println("**************************");
		System.out.println();

		int options = 0;
		char yesOrNo;

		do {
			System.out.print("Enter an option: ");
			Scanner sc = new Scanner(System.in);
			int option1 = sc.nextInt();
			options = option1;

			switch (options) {
			case 1:
				System.out.println("Item: PC Gaming");
				setDescription(
						"Description: COMPUTADOR GAMER, INTEL I5-10400F, GEFORCE RTX 3060 8GB, 8GB DDR4, SSD 240GB");
				System.out.println(this.description);
				setPrice(3489.45);
				System.out.printf("Price: $%.2f%n", this.price);
				System.out.print("Please enter the quantity: ");
				this.quantity = sc.nextInt();
				System.out.print("Do you want to buy this product(y/n)? ");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 'y') {
					System.out.println("Congratulations you product will be arrive soon");
					System.out.println();
					this.numInvoice = randomInvoice(invoiceLegth);
					printInvoice();
				}
				break;
			case 2:
				System.out.println("Item: Laptop");
				setDescription("Laptop, Intel Core I3-1115G4, Windows 10 Home, 4GB, 1TB, 15.6´´ Full Hd, Led");
				this.setDescription(description);
				System.out.println(this.description);
				setPrice(3878.46);
				System.out.printf("$%.2f", this.price);
				System.out.print("Please enter the quantity: ");
				this.quantity = sc.nextInt();
				System.out.print("Do you want to buy this product(y/n)? ");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 'y') {
					System.out.println("Congratulations you product will be arrive soon");
					System.out.println();
					this.numInvoice = randomInvoice(invoiceLegth);
					printInvoice();
				}
				break;

			case 3:
				System.out.println("Item: Cellphone");
				setDescription("Smartphone 5G SM-A536 128gb Preto 8gb Ram");
				System.out.println(this.description);
				setPrice(1393.87);
				System.out.printf("$%.2f%n", this.price);
				System.out.print("Please enter the quantity: ");
				this.quantity = sc.nextInt();
				System.out.print("Do you want to buy this product(y/n)? ");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 'y') {
					System.out.println("Congratulations you product will be arrive soon");
					System.out.println();
					this.numInvoice = randomInvoice(invoiceLegth);
					printInvoice();
				}
				break;
			case 4:
				System.out.println("Item: TV Smart 8K");
				setDescription("SSmart TV QLED 50\" 8K UHD  50Q60B - Alexa built-in, Wifi");
				System.out.println(this.description);
				setPrice(3193.00);
				System.out.printf("$%.2f%n", this.price);
				System.out.print("Please enter the quantity: ");
				this.quantity = sc.nextInt();
				System.out.print("Do you want to buy this product(y/n)? ");
				yesOrNo = sc.next().charAt(0);
				if (yesOrNo == 'y') {
					System.out.println("Congratulations you product will be arrive soon");
					System.out.println();
					this.numInvoice = randomInvoice(invoiceLegth);
					printInvoice();
				}
				break;
			case 5:
				System.out.println("**************************");
				break;
			default:
				System.out.printf("Unexpected value: " + options);
				break;
			}

		} while (options != 5);
	}

	private void printInvoice() {
		String InvoicePrint = String.format(
				"**************************%n" + "INVOICE%n" + "**************************%n" + "%nNº: %s%n"
						+ "DESCRPTION: %s%n" + "PRICE: %s%n" + "QTD: %d%n" + "TOTAL: %.2f",
				numInvoice, description, price, quantity, getInvoiceAmount());

		System.out.println(InvoicePrint);
	}

	private String randomInvoice(int length) {
		String invoiceSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] invoice = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * invoiceSet.length());
			invoice[i] = invoiceSet.charAt(rand);
		}
		return new String(invoice);
	}

	public double getInvoiceAmount() {
		return this.price * this.quantity;
	}

	// getters e setters
	public String getNumInvoice() {
		return numInvoice;
	}

	public void setNumInvoice(String numInvoice) {
		this.numInvoice = numInvoice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
