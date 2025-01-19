package com.Employee.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.exception.EmployeeNotFoundException;
import com.Employee.model.Employee;
import com.Employee.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	  @Autowired
	    private IEmployeeRepository employeeRepository;

	  @Override
	  public List<Employee> getAllEmployees() {
	      List<Employee> employees = employeeRepository.findAll();
	      
	      // If the list is empty, throw an exception
	      if (employees.isEmpty()) {
	          throw new EmployeeNotFoundException("No employees found.");
	      }

	      return employees;
	  }



	    @Override
	    public Employee getEmployeeById(int emp_Id) {
	        return employeeRepository.findById(emp_Id)
	            .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID " + emp_Id + " not found."));
	    }


	    @Override
	    public Employee addEmployee(Employee employee) {
	        // Example validation to check for duplicate employee ID or other conditions
	        if (employeeRepository.existsById(employee.getEmp_Id())) {
	            throw new EmployeeNotFoundException("Employee with ID " + employee.getEmp_Id() + " already exists.");
	        }

	        // If validation passes, save the employee
	        return employeeRepository.save(employee);
	    }


	    @Override
	    public Employee updateEmployee(int emp_Id, Employee employee) {
	        // Ensure the employee with the given ID exists, otherwise throw an exception
	        employeeRepository.findById(emp_Id)
	            .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID " + emp_Id + " not found."));

	        // Set the employee ID to ensure it's preserved
	        employee.setEmp_Id(emp_Id);
	        
	        // Save and return the updated employee
	        return employeeRepository.save(employee);
	    }



	    @Override
	    public void deleteEmployee(int emp_Id) {
	        // Check if the employee with the given ID exists, and if not, throw an exception
	        employeeRepository.findById(emp_Id)
	            .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID " + emp_Id + " not found."));
	        
	        // If the employee exists, delete it
	        employeeRepository.deleteById(emp_Id);

	        // Log or return a confirmation message
	        System.out.println("Employee with ID " + emp_Id + " has been deleted from the database.");
	    }



}
