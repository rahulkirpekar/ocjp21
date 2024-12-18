package oops.bankapp;

public class CurrentAccount extends BankAccount
{
	private double overdraftLimit;
	
	public CurrentAccount(String accountNumber,String accountHolderName,double balance, double overdraftLimit) 
	{
		super(accountNumber,accountHolderName,balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double amount) 
	{
		if (amount <= (balance + overdraftLimit)) 
		{
			balance = balance - amount;
			
			System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
		} else 
		{
			 System.out.println("Withdrawal exceeds overdraft limit!");
		}
	}
}
