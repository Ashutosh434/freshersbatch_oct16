package com.bankapp;

public interface BankAccountRepository {
	double getBalance(long accountID);
	double updateBalance(long accountID,double newBalance);
}
