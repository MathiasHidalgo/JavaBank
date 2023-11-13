import java.util.Scanner;

class BankDetails {
	private String accno;
	private String name;
	private String acc_type;
	private long balance;

	Scanner sc = new Scanner(System.in);

	//method to open new account
	public void openAccount(){
		System.out.print("Enter Account Nº:");
		accno = sc.next();
		System.out.print("Enter Account type:");
		acc_type = sc.next();
		System.out.print("Enter Name:");
		name = sc.next();
		System.out.print("Enter Balance:");
		balance = sc.nextLong();
	}

	public void showAccount() {
		System.out.println("Name of account holder:" + name);
		system.out.println("Account nº.:" + accno);
		System.out.println("Account type.:" + acc_type);
		System.out.println("Balance:" + balance);
	}
}
