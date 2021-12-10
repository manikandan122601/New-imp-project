package org.emp;

import java.util.Scanner;

public class EmpInfo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ur age:  ");
		byte age = s.nextByte();
		System.out.println("Enter ur id: ");
		short id = s.nextShort();
		System.out.println("Enter ur Deptno : ");
		int deptNo = s.nextInt();
		System.out.println("Enter ur Name :  ");
		String name = s.next();
		System.out.println("Enter ur Phno :  ");
		long phNo = s.nextLong();
		System.out.println("Enter ur Salary :  ");
		float sal = s.nextFloat();
		System.out.println("Enter ur gender");
		char gen = s.next().charAt(0);
		System.out.println("Emp Details");
		System.out.println("============");
		System.out.println("Emp Age: "+ age);
		System.out.println("Emp Id: "+ id);
		System.out.println("Emp DeptNO: "+ deptNo);
		System.out.println("Emp Name: "+ name);
		System.out.println("Emp Phno: "+ phNo);
		System.out.println("Emp gender: "+ gen);
		System.out.println("Emp salary: "+ sal);
	}
	
		

}
