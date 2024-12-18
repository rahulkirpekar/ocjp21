package oops.bankapp;

// Parent Class--BankAccount 
public class BankAccount 
{
	protected String accountNumber;
	protected String accountHolderName;
	protected double balance;	

	public BankAccount(String accountNumber,String accountHolderName,double balance) 
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	// deposite method
	public void deposite(int amount) 
	{
		balance = balance + amount;
		System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	}
	
	// withdraw method
	public void withdraw(int amount) 
	{
		if (amount <= balance) 
		{
			balance = balance - amount;
			
			System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
		} else 
		{
			System.out.println("Insufficient Balance");
		}
	}
	
	// display account details
	public void displayAccountDetails() 
	{
		System.out.println("AccountNumber : " + accountNumber);
		System.out.println("Account HolderName : " + accountHolderName);
		System.out.println("Balance : " + balance);
	}
}
