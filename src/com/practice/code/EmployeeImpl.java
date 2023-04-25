package com.practice.code;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public  class EmployeeImpl implements Employee 
{
	Employee1 employee1 = new Employee1();
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase", "root",
				"Vais@123");
		// System.out.println(con);
		return con;
	}

	@Override
	public void saveEmployee(Employee1 employee1) throws ClassNotFoundException, SQLException
	{
		Connection con = EmployeeImpl.getConnection();
		String s1 = "INSERT INTO employeedetails (empId,empName,empAge,empDepartment,empSalary) Values(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(s1);
		ps.setInt(1,employee1.getId());
	    ps.setString(2,employee1.getName());
		ps.setInt(3,employee1.getAge());
		ps.setString(4,employee1.getDepartment());
		ps.setLong(5,employee1.getSalary());
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		
	}
	@Override
	public void updateEmployeeDepartment(Employee1 employee1) throws ClassNotFoundException, SQLException
	{
		Connection con = EmployeeImpl.getConnection();
		String s2 = "update employeedetails set empDepartment =? where empId= ?";
		PreparedStatement ps = con.prepareStatement(s2);
		ps.setString(1,employee1.getDepartment());
		ps.setInt(2,employee1.getId());
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		
	}
public void deleteEmployee(Employee1 employee1) throws ClassNotFoundException, SQLException 
	{
		Connection con = EmployeeImpl.getConnection();
		String s3 = "DELETE FROM employeedetails WHERE empId=? ";
		PreparedStatement ps = con.prepareStatement(s3);
		ps.setInt(1,employee1.getId());
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);

	}

	@Override
	public  List<Employee1> displayListOfEmployee() throws ClassNotFoundException, SQLException 
	
	{
		Connection con = EmployeeImpl.getConnection();
		String s = "select empId,empName,empAge,empDepartment,empSalary from employeedetails";
		PreparedStatement ps = con.prepareStatement(s);
		ResultSet rs = ps.executeQuery();
		ArrayList List = new ArrayList();
		while(rs.next())
		{
			int id= rs.getInt(1);
		     String name = rs.getString(2);
		     int age = rs.getInt(3);
		     String department = rs.getString(4);
		     Long salary = rs.getLong(5);
		     Employee1 employee1 = new Employee1();
		     employee1.setId(id);
		     employee1.setName(name);
		     employee1.setAge(age);
		     employee1.setDepartment(department);
		     employee1.setSalary(salary);
		     List.add(employee1);
		}
		return List;
		
	}
	
	public void employeefindById(Employee1 employee1) throws ClassNotFoundException, SQLException

	{
		Connection con = EmployeeImpl.getConnection();
		Statement st = con.createStatement();
		String s = "select empId,empName,empAge,empDepartment,empSalary from employeedetails where empId=?";
		PreparedStatement ps = con.prepareStatement(s);
		ps.setInt(1,employee1.getId());
		ResultSet rs = ps.executeQuery();
		while (rs.next())
		{
System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
					+ rs.getString(4) + "\t" + rs.getString(5));
		}
	}
		public void employeefindByName(Employee1 employee1) throws ClassNotFoundException, SQLException

		{
			Connection con = EmployeeImpl.getConnection();
			Statement st = con.createStatement();
			String s = "select empId,empName,empAge,empDepartment,empSalary from employeedetails where empName=?";
			PreparedStatement ps = con.prepareStatement(s);
			ps.setString(1,employee1.getName());
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
	System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5));
			}
                          
		}
		
		public void employeefindByDepartment(Employee1 employee1) throws ClassNotFoundException, SQLException

		{
			Connection con = EmployeeImpl.getConnection();
			Statement st = con.createStatement();
			String s = "select empId,empName,empAge,empDepartment,empSalary from employeedetails where empDepartment=?";
			PreparedStatement ps = con.prepareStatement(s);
			ps.setString(1,employee1.getDepartment());
			ResultSet rs = ps.executeQuery();
			
			while (rs.next())
			{
	System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5));
			}
		}
		

		
		
		

		

		

		
}



