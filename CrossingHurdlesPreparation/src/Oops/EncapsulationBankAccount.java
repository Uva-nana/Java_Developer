package Oops;
//Encapsulation
public class EncapsulationBankAccount {
 /* 📝 Problem Statement:

  Create a BankAccount class with:
  - Private fields: accountHolder (String), balance (double)
  - Constructor to initialize values
  - Methods: deposit(), withdraw(), getBalance()
  - Validation: deposit must be positive, withdraw must not exceed balance */
	
	private String accountHolder;
	private double balance;
	
	public EncapsulationBankAccount (String name , double initialbalance) {
		this.accountHolder = name;
		this.balance = initialbalance;
	}
	
	public double getBalance() {
		return balance;
	} //this method is returning balance
	
	public void deposit(double amount)
{   if (amount >0)
{
	balance = balance+amount;
	System.out.println("Deposited" +" " + amount);
	
}
else {
	System.out.println("Invalid amount");
}
		}
	
	public void withdraw(double amount) {
		
		if (amount<=balance) {
			balance -= amount;
			
			System.out.println("Amount withdraw Successfully");
			
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
		
		public static void main (String [] args) {
			EncapsulationBankAccount acc = new EncapsulationBankAccount ("Yuva" , 5000);
			acc.deposit(2000);
			acc.withdraw(1000);
			acc.withdraw(10000);
			System.out.println("Balance"+ acc.getBalance());
		}
		
	}

