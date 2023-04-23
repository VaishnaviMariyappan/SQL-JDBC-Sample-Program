package com.practice.code;

import java.sql.Connection;
import java.util.Scanner;
import java.sql.SQLException;
public class TestEmployee
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		EmployeeImpl emp1 = new EmployeeImpl();
		//emp1.saveEmployee();
		//emp1.updateEmployee();
		//emp1.deleteEmployee();
		//emp1.employeeList();
		//getConnection;
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Employee Id:");
		//int id = sc.nextInt();
		//emp1.employeefindById(id);
		
		//Scanner sc1 = new Scanner(System.in);
		//System.out.println("Enter the Employee Name:");
		//String s = sc1.nextLine();
		//emp1.employeefindByName(s);
		
		//Scanner sc2 = new Scanner(System.in);
		//System.out.println("Enter the Employee Department:");
		//String s1 = sc2.nextLine();
		//emp1.employeefindByDepartment(s1);
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the Employee Salary:");
		int salary = sc3.nextInt();
		emp1.employeefindBySalary(salary);
		}
	}
