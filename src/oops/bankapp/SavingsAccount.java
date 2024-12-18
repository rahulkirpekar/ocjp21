package oops.bankapp;

public class SavingsAccount extends BankAccount
{
	private double interestRate;
	
	
	// super. --parent dm's access
	// super()---parent class constructor
//-------------------------------------------------------------------	
	// this. ---
	// this()--current class constructoor--->current class other constructor call
	
	
	public SavingsAccount(String accountNumber,String accountHolderName,double balance, double interestRate) 
	{
		super(accountNumber,accountHolderName,balance);
		this.interestRate = interestRate;
	}
	
	// calculate interest---add into main balance
	public void addInterest() 
	{
		double interestAmount = balance * (interestRate / 100);
		
		balance = balance + interestAmount;
		
		System.out.println("Interest Added: " + interestAmount + ", New Balance: " + balance);
	}
}
