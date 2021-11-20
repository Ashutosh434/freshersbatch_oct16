package com.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/bankapp/config.xml");
		BankAccount account = (BankAccount) context.getBean("account");
		BankAccountrepositoryImpl accountImpl = (BankAccountrepositoryImpl) context.getBean("emp1");
		BankAccountServiceImpl services = (BankAccountServiceImpl) context.getBean("emp2");
		System.out.println(account);
		System.out.println(accountImpl);
		System.out.println(services);
		
	}

}
