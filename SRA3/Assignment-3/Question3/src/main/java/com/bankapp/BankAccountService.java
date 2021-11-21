package com.bankapp;

public interface BankAccountService {
	double widthdraw(long accountId,double balance);
	double deposit(long accountId,double balance);
	double getBalance(long accountId);
}
