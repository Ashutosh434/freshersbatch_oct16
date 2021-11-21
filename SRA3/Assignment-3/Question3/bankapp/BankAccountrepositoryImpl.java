package com.bankapp;

import java.util.List;

public class BankAccountrepositoryImpl implements BankAccountRepository{
	
	private BankAccount  account;
	public double getBalance(long accountID) {
		// TODO Auto-generated method stub
		
			 if(account.getAccountId()==accountID) 
				 return account.getBalance();
		 
		return 0;

	}

	public double updateBalance(long accountID, double newBalance) {
		// TODO Auto-generated method stub
			 if(account.getAccountId()==accountID) {
				 account.setBalance(newBalance);
				 return account.getBalance();
			 }
		return 0;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "BankAccountrepositoryImpl [account=" + account + "]";
	}

	
}
