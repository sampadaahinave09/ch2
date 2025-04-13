package com.tnsif.day1.scannerclassdemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter Gender");
		String gender = sc.nextLine();
		
		System.out.println("Enter income");
		int income = sc.nextInt();
		
		
		Person p = new Person(name, age, income, gender);
		
		Tax tax = new Tax();
		tax.calTax(p);
		
		System.out.println(p);
		sc.close();
	}

}
