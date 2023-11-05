package application;

import java.util.Locale;
import java.util.Scanner;

import UserBank.AccBank;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AccBank accbank;
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char respost = sc.next().charAt(0);
		if(respost == 'y') {
			System.out.print("Enter initial deposite value: ");
		    double initialDeposit = sc.nextDouble();
			accbank = new AccBank(number, holder, initialDeposit);
		}
		else {
			accbank = new AccBank(number, holder);
		}
		System.out.println();
		System.out.println("Acount data: ");
		System.out.println(accbank.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		accbank.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(accbank.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		accbank.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(accbank.toString());
		
		sc.close();
		

	}

}
