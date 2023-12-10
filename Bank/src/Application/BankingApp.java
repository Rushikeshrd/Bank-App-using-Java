package Application;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = sc.next();
		int id = 1 + (int) (Math.random()*10000000);
		BankAccount b = new BankAccount(name,id);
		b.ShowMenu();
		
	}

}
