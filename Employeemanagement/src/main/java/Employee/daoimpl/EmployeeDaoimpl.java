package Employee.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Project.Employee;

import Employee.dao.EmployeeDao;

public class EmployeeDaoimpl implements EmployeeDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// List of Employee.
	List<Employee> sList = new ArrayList<Employee>();

	// Creating Scanner for Employee.
	Scanner sc = new Scanner(System.in);

	private char[] e;

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		// Creating Employee as an Object.
		Employee e = new Employee();

		System.out.println();

		// Input for Employee.
		System.out.println("Enter Employee ID Below");
		e.setEmployeeID(sc.nextInt());
		System.out.println("Enter Employee Name Below");
		e.setEmployeeName(sc.next());
		System.out.println("Enter Employee Salary Below");
		e.setEmployeeSalary(sc.nextFloat());
		sList.add(e);
		System.out.println(sList);

	}

	@Override
	public boolean deleteEmployee(int ID) {
		// TODO Auto-generated method stub
		boolean status = false;
		Employee e1del = null;
		// Finding the Employee Record.
		for (Employee e1 : sList) {
			if (e1.getEmployeeID() == ID)
				e1del = e1;
		}
		// Check record present or not.
		if (e1del == null)
			status = false;
		else {
			sList.remove(e1del);
			status = true;

		}

		return status;
	}

	@Override
	public boolean updateEmployee(int ID, Employee a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee findEmployee(int ID) {
		// TODO Auto-generated method stub

		Employee e1find = null;
		// Finding the Employee Record.
		for (Employee e1 : sList) {
			if (e1.getEmployeeID() == ID)
				e1find = e1;
		}

		return e1find;
	}

	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
		for (Employee e1 : sList) {
			System.out.println(e1);
		}

	}
}
