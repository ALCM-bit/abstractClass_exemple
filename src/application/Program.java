package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.00, 500.00));
		
		double sum = 0.0;
		
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f", sum);
		
		for(Account acc : list) {
			acc.deposit(10.00);
		}
		
		for(Account acc : list) {
			System.out.println("");
			System.out.printf("Updated balance for account %d: %.2f", acc.getNumber(), acc.getBalance());
		}
	}
}
