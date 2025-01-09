package com.Employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.model.Employee;
import com.Employee.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	  @Autowired
	    private IEmployeeRepository employeeRepository;

	    @Override
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    @Override
	    public Employee getEmployeeById(int emp_Id) {
	        Optional<Employee> employee = employeeRepository.findById(emp_Id);
	        return employee.orElse(null);
	    }

	    @Override
	    public Employee addEmployee(Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    @Override
	    public Employee updateEmployee(int emp_Id, Employee employee) {
	        if (employeeRepository.existsById(emp_Id)) {
	            employee.setEmp_Id(emp_Id);  // ensure the ID stays the same
	            return employeeRepository.save(employee);
	        }
	        return null;
	    }

	    @Override
	    public void deleteEmployee(int emp_Id) {
	        employeeRepository.deleteById(emp_Id);
	    }

}
