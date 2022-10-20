package Employee.dao;

import com.Project.Employee;

public interface EmployeeDao {

	void addEmployee();

	boolean deleteEmployee(int ID);

	boolean updateEmployee(int ID, Employee a);

	Employee findEmployee(int ID);

	void displayAll();
}
