package com.practice.code;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;
public class TestEmployee
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		EmployeeImpl emp1 = new EmployeeImpl();
		Employee1 employee1 = new Employee1();
		/*Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Employee Id:");
		int id = sc.nextInt();
		employee1.setId(id);
		employee1.setName("Harshitha");
		employee1.setAge(25);
		employee1.setDepartment("IT");
		employee1.setSalary(53000l);
		System.out.println(employee1.getName());
		emp1.saveEmployee(employee1);*/
	
 /*Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Employee Id:");
 employee1.setId(sc.nextInt());
 System.out.println("Enter the new Department:");
 employee1.setDepartment(sc.next());
emp1.updateEmployeeDepartment(employee1);*/

		
		/*List <Employee1> list = emp1.displayListOfEmployee();
		System.out.println(list);*/
		
		/*Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Employee Id:");
		employee1.setId(sc.nextInt());
		emp1.deleteEmployee(employee1);*/
 
/*Scanner sc = new Scanner(System.in);
System.out.println("Enter the Employee Id:");
employee1.setId(sc.nextInt());
emp1.employeefindById(employee1);*/

/*Scanner sc = new Scanner(System.in);
System.out.println("Enter the Employee Name:");
employee1.setName(sc.nextLine());
emp1.employeefindByName(employee1);*/
	 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Employee Department:");
employee1.setDepartment(sc.nextLine());
emp1.employeefindByDepartment(employee1);	 	
	
	}
}