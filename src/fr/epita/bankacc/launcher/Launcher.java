package fr.epita.bankacc.launcher;

import java.util.Scanner;

import fr.epita.bankacc.dm.Customer;
import fr.epita.bankacc.dm.SavingsAccount;

public class Launcher {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("-------Bank Account System-------");
		System.out.println("Please enter your NAME");
		String name = s.nextLine();
		System.out.println("Please Enter your Address");
		String add = s.nextLine();
		Customer c = new Customer(name,add);
		System.out.println("Enter your Interest Rate");
		double ir = s.nextDouble();
		s.close();
		SavingsAccount sa = new SavingsAccount();
		sa.setIr(ir);
		System.out.println("Your name is : "+c.getName());
		System.out.println("You live in : "+c.getAddress());
		System.out.println("Your Interest rate is : "+sa.getIr());
	}

}
