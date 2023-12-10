package Application;

import java.util.Scanner;

public class BankAccount {
	int balance;
	int prevTransaction;
	String custName;
	int custId;
	
	BankAccount(String cname, int cid){
		custName = cname;
		custId = cid;
	}
	
	void deposit(int amt) {
		if(amt != 0) {
			balance += amt;
			System.out.println("Rs."+amt+" Deposited to your acoount!");
		}
	}
	
	void withdraw(int amt) {
		if(balance < amt) {
			System.out.println("Insufficient Balance!! Please Check Account Balance...");
		}
		else{
			balance -= amt;
			System.out.println("Rs."+amt+" Withdrawn from your account!");
		}
	}

	
	void ShowMenu() {
		char choice = '\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome "+custName);
		System.out.println("Your ID is "+custId);
		System.out.println("A.Check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.Exit");
		
		do {
			System.out.print("\nEnter your Choice:");
			choice = sc.next().charAt(0);
			
			switch(choice) 
			{
			case 'A':
				System.out.println(" ______________________________________________");
				System.out.println("|                                              |");
				System.out.println("|           Your Account Balance is "+balance);
				System.out.println("|______________________________________________|");
				break;
				
			case 'B':
				System.out.println(" ______________________________________________");
				System.out.println("|                                              |");
				System.out.println("|           Enter Amount to Deposit            |");
				System.out.println("|______________________________________________|");
				System.out.print("Rs.");
				int amt = sc.nextInt();
				deposit(amt);
				break;	
				
			case 'C':
				System.out.println(" ______________________________________________");
				System.out.println("|                                              |");
				System.out.println("|           Enter Amount to Withdraw           |");
				System.out.println("|______________________________________________|");
				System.out.print("Rs.");
				int w_amt = sc.nextInt();
				withdraw(w_amt);
				break;	
			
			case 'D':
				break;
			
			default:
				System.out.println(" ______________________________________________");
				System.out.println("|                                              |");
				System.out.println("|       Invalid Option!!.Please enter again    |");
				System.out.println("|______________________________________________|");
				System.out.println("");
				break;
			}
		}while(choice !='D');
		
		System.out.println("\nThank You for using our Services!!");
		
	}
	
}
