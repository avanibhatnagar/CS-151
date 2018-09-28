package hw3;

import java.util.TreeSet;

public class BankAccountTester {
	
	 public static void main(String args[]){
	        BankAccount b1 = new BankAccount(1000);
	        BankAccount b2 = new BankAccount(5090.96);
	        BankAccount b3 = new BankAccount(7.68);
	        BankAccount b4 = new BankAccount(790000);

	        TreeSet<BankAccount> sortedBankAccounts = new TreeSet<>();
	        sortedBankAccounts.add(b1);
	        sortedBankAccounts.add(b2);
	        sortedBankAccounts.add(b3);
	        sortedBankAccounts.add(b4);

	        for(BankAccount account: sortedBankAccounts)
	        {
	            System.out.println(account.getBalance());
	        }
	    }
}
