package PojoTopic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeImplementation {
	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		int count = 1;
		while (count != 0) {
			System.out.println("Enter Employee id: ");
			int empid = sc.nextInt();
			System.out.println("Enter Employee name: ");
			String empname = sc.next();
			System.out.println("Enter Employee salary: ");
			double empsal = sc.nextDouble();

			emps.add(new Employee(empid, empname, empsal));
			System.out.println("Want to add more? press 1 else 0");
			int option = sc.nextInt();
			if (option == 0) {
				count = 0;
			}

		}
		System.out.println(emps);
		
		System.out.println("");

	}

}
