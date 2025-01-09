package com.Employee.Service;

import java.util.List;

import com.Employee.model.Employee;

public interface IEmployeeService {
	
	
	 List<Employee> getAllEmployees();
	    Employee getEmployeeById(int emp_Id);
	    Employee addEmployee(Employee employee);
	    Employee updateEmployee(int emp_Id, Employee employee);
	    void deleteEmployee(int emp_Id);

}
