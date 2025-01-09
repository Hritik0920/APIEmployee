package com.Employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Delails")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Emp_Id;
	private String Emp_Name;
	private String Emp_Address;
	private String Emp_Number;
	
	public int getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public String getEmp_Address() {
		return Emp_Address;
	}
	public void setEmp_Address(String emp_Address) {
		Emp_Address = emp_Address;
	}
	public String getEmp_Number() {
		return Emp_Number;
	}
	public void setEmp_Number(String emp_Number) {
		Emp_Number = emp_Number;
	}
	@Override
	public String toString() {
		return "Employee [Emp_Id=" + Emp_Id + ", Emp_Name=" + Emp_Name + ", Emp_Address=" + Emp_Address
				+ ", Emp_Number=" + Emp_Number + "]";
	}
	public Employee(int emp_Id, String emp_Name, String emp_Address, String emp_Number) {
		super();
		Emp_Id = emp_Id;
		Emp_Name = emp_Name;
		Emp_Address = emp_Address;
		Emp_Number = emp_Number;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
