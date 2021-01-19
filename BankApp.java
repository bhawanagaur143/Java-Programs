package example;
class BankAccount{
	private double balance;
	public BankAccount(double openingBalance) {
		balance=openingBalance;
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public void withdrawl(double amount) {
		balance=balance-amount;
	}
	public void display() {
		System.out.println(balance);
	}
}

public class BankApp {

	public static void main(String[] args) {
		BankAccount ba1=new BankAccount(100.00);
		System.out.print("Balance before transcation : ");
		ba1.display();
		ba1.deposit(75.00);
		ba1.withdrawl(20.00);
		System.out.print("Balance after transcation : ");
		ba1.display();	
	}
}
