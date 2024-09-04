package com.controller;

import com.dao.EmployeeDao;
import com.entity.Employee;
import java.util.Scanner;

public class EmployeeControl {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao(10);
		Scanner scanner = new Scanner(System.in);
		int choice;

		dao.addEmployee(new Employee(1, "Raj Patil", "Developer", 70000));
		dao.addEmployee(new Employee(3, "Neha Singh", "Developer", 75000));
		dao.addEmployee(new Employee(7, "Jay Rajput", "Manager", 48000));
		dao.addEmployee(new Employee(2, "Ranbir Kapoor", "HR", 48000));
		dao.addEmployee(new Employee(5, "Sita Kumar", "Tester", 48000));
		dao.addEmployee(new Employee(4, "Rajeev Kumar", "Developer", 56000));
		dao.addEmployee(new Employee(6, "Meera Patel", "Manager", 54000));
		dao.addEmployee(new Employee(8, "Anil Kumar", "Tester", 47000));
		dao.addEmployee(new Employee(9, "Pooja Shah", "Developer", 71000));
		dao.addEmployee(new Employee(10, "Ravi Singh", "HR", 50000));

		do {
			System.out.println("\nEmployee Management System");
			System.out.println("1. Show Employee by ID");
			System.out.println("2. Show All Employees");
			System.out.println("3. Display Employee with Maximum Salary");
			System.out.println("4. Display Employee with Minimum Salary");
			System.out.println("5. Show Employees by Role");
			System.out.println("6. Sort Employees by Ascending ID");
			System.out.println("7. Sort Employees by Descending ID");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Employee ID: ");
				int id = scanner.nextInt();
				Employee e = dao.showEmployeeById(id);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Employee not found.");
				}
				break;
			case 2:
				dao.showAllEmployees();
				break;
			case 3:
				e = dao.getEmployeeWithMaxSalary();
				if (e != null) {
					System.out.println("Employee with max salary: " + e);
				}
				break;
			case 4:
				e = dao.getEmployeeWithMinSalary();
				if (e != null) {
					System.out.println("Employee with min salary: " + e);
				}
				break;
			case 5:
				System.out.print("Enter Role: ");
				String role = scanner.nextLine();
				dao.showEmployeesByRole(role);
				break;
			case 6:
				dao.sortEmployeesAsc();
				break;
			case 7:
				dao.sortEmployeesDesc();
				break;
			case 8:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 8);

		scanner.close();
	}
}
