package entite;

import java.util.Scanner;

import dados.clientAccount;

public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------Welcom to the Borges Bank---------------");
		System.out.println();
		
		clientAccount client;
		
		System.out.print("Enter account number:");
		int accountNumber =sc.nextInt();
		
		System.out.println();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println();
		System.out.print("Is there an inicial deposit(y/n)?");
		char resp=sc.next().charAt(0);
		if(resp == 'y') {
			System.out.println();
			System.out.print("Enter initial value:");
			double initialDeposit=sc.nextDouble();
			client = new clientAccount(accountNumber,name, initialDeposit);
		}
		
		else {
			 client= new clientAccount(accountNumber,name);
		}
		
		System.out.println();
		System.out.println("Account update:");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter deposit value:");
		double depositValue=sc.nextDouble();
		client.deposit(depositValue);
		
		System.out.println();
		System.out.println("Account update:");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a withdraw:");
		double withdrawValue=sc.nextDouble();
		client.withdraw(withdrawValue);
		
		System.out.println();
		System.out.println("Account update:");
		System.out.println(client);
		
		sc.close();

	}

}
