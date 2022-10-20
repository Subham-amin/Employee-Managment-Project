/**
@author Subham Amin.

"Q. WAP to  create Employee management using collections 
Perform operations:
1.Add an employee
2. Delete an employee
3. Find an employee"
4. Display
 
 */
package com.Project;

public class Employee {
	private int EmployeeID;
	private String EmployeeName;
	private float EmployeeSalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeID, String employeeName, float employeeSalary) {
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public float getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + "]";
	}
}