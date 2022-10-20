package com.Employeemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Project.Employee;

import Employee.dao.EmployeeDao;
import Employee.daoimpl.EmployeeDaoimpl;

public class App {
	public static void menu() {
		System.out.println("-----  MENU ----");
		System.out.println("TYPE 1 FOR ADD AN EMPLOYEE DETAILS");
		System.out.println("TYPE 2 FOR DELETE AN EMPLOYEE DETAILS");
		System.out.println("TYPE 3 FOR FIND AN EMPLOYEE DETAILS");
		System.out.println("TYPE 4 FOR DISPLAY EMPLOYEE DETAILS");
		System.out.println("TYPE 5 FOR EXIT");

	}

	public static void main(String[] args) {
		System.out.println("-- Welcome To Employee Management System --");

		System.out.println("------*****------");

		// Creating Scanner for Employee.
		Scanner sc = new Scanner(System.in);
		// Creating Object of Impl.
		EmployeeDao managment = new EmployeeDaoimpl();

		// List of Employee.
		List<Employee> sList = new ArrayList<Employee>();
		// Declearing Choice.
		int ch = 0;
		do {
			menu();
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				managment.addEmployee();
				System.out.println("Employee Inserted");
				break;
			case 2:
				System.out.println("Enter Employee ID for Delete");
				int ID = sc.nextInt();
				boolean flag = managment.deleteEmployee(ID);
				if (flag)
					System.out.println("Employee Record Deleted");
				else
					System.out.println("Employee Record Not Found");
				break;
			case 3:
				Employee e = null;
				System.out.println("Enter Employee ID to find");
				ID = sc.nextInt();
				e = managment.findEmployee(ID);
				if (e == null)
					System.out.println("Employee Not Found");
				else
					System.out.println("Employee ID " + e.getEmployeeID());
				System.out.println("Employee Name " + e.getEmployeeName());
				System.out.println("Employee Salary " + e.getEmployeeSalary());
				break;
			case 4:
				managment.displayAll();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Input");

			}

		} while (ch != 5);

	}
}
