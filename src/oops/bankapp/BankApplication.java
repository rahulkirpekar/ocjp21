package oops.bankapp;

import java.util.Scanner;

/*

 * Bank Application
*****************
A bank system has different types of accounts: 

	===> Savings Account and 
	===> Current Account. 

	Both accounts share some common properties like 
			===> accountNumber, 
			===> accountHolderName, and 
			===> balance. 

	However, they differ in their behaviors, such as:

===> A Savings Account earns interest.// 10000---10000
===> A Current Account has an overdraft limit.// 10000(50000) = 60000
--------------------------------------------------------------------------------------------------------------------
				Dm's
				-----					
					--accountNumber
					--accountHolderName
					--balance	
				Mf's
				----
					  **deposite
					  **withdraw
					  **displayAccountDetails(....)

					BankAccount(Parent Class)
					    |
			------------------------------------------
			|								|
		SavingsAccount				  CurrentAccount
		--double-interestRate			  --overdraftLimit--[10000 + 50000] = 60000/-
		**addInterest				  		**withdraw
		

BankApplication---Impl

	main 

 */
public class BankApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your BankAccount Type");
		System.out.println("1) For Saving Account");
		System.out.println("2) For Current Account");
		int choice = sc.nextInt();
		
		switch(choice) 
		{
			case 1: SavingsAccount savingAccount = new SavingsAccount("aa1", "Rakesh Patel", 10000, 3.0);
					savingAccount.displayAccountDetails();
					savingAccount.withdraw(11000);
					savingAccount.withdraw(5000);// 5000
					savingAccount.displayAccountDetails();
					savingAccount.deposite(15000);
					savingAccount.addInterest();// 20000--3.0 % = 5000+
					savingAccount.displayAccountDetails();
					
					break;

			case 2: CurrentAccount currentAccount = new CurrentAccount("cc1","Ankur Barot",10000,100000);
					currentAccount.displayAccountDetails();
					
					
					System.out.println("Enter Amount ");
					double amount = sc.nextInt();
					
					currentAccount.withdraw(amount);// 
					
					
					currentAccount.withdraw(110000.0);// 0
					currentAccount.displayAccountDetails();
					currentAccount.deposite(20000);// 20000
					currentAccount.displayAccountDetails();
					break;
		}
	}
}



