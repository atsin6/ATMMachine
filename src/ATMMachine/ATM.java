package ATMMachine;

import java.util.Scanner;

public class ATM {
	
	private float Balance;
	private int PIN = 5674;
	
	public void checkpin() {
		System.out.println("Enter your pin: ");
		Scanner sc = new Scanner(System.in);
		
		int enteredPin = sc.nextInt();
		if(enteredPin==PIN) {
			menu();
		}
		else {
			System.out.println("INVALID PIN!");
			checkpin();
		}
	}
	
	public void menu() {
		System.out.println("Enter Your Choice: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. EXIT");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		if(opt==1) {
			checkBalance();
		}
		else if(opt==2) {
			withdrawMoney();
		}
		else if(opt==3) {
			depositeMoney();
		}
		else if(opt==4) {
			return;
		}
		else {
			System.out.println("Enter a valid choice");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + Balance);
		menu();
	}
	
	public void withdrawMoney() {
		System.out.println("Enter Amount to Withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance - amount;
			System.out.print("Money Withdrawl Successful");
			checkBalance();
		}
		menu();
	}
	
	public void depositeMoney() {
		System.out.println("Enter Amount to Deposite: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		
		Balance += amount;
		System.out.println("Money Deposite Successful");
		checkBalance();
		menu();
	}
	
}
