package com.practice.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class EmployeeImpl implements Employee {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedatabase", "root",
				"Vais@123");
		// System.out.println(con);
		return con;
	}

	public void saveEmployee() throws ClassNotFoundException, SQLException {
		Connection con = EmployeeImpl.getConnection();
		String s1 = "INSERT INTO employeedetails VALUES(9,'Shanthini',28,'Lawyer',25000)";
		PreparedStatement ps = con.prepareStatement(s1);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
	}

	public void updateEmployee() throws ClassNotFoundException, SQLException {
		Connection con = EmployeeImpl.getConnection();
		String s2 = "UPDATE employeedetails SET empDepartment ='AssistantProfes' WHERE empId = 8";
		PreparedStatement ps = con.prepareStatement(s2);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);

	}

	public void deleteEmployee() throws ClassNotFoundException, SQLException {
		Connection con = EmployeeImpl.getConnection();
		String s3 = "DELETE FROM employeedetails WHERE empId=9 ";
		PreparedStatement ps = con.prepareStatement(s3);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);

	}

	public void employeeList() throws ClassNotFoundException, SQLException {
		try {
			Connection con = EmployeeImpl.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select *from employeedetails");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5));
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void employeefindById(int id) throws ClassNotFoundException, SQLException

	{
		Connection con = EmployeeImpl.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select *from employeedetails where empId = '"+id+"'");
		while (rs.next())
		{
System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
					+ rs.getString(4) + "\t" + rs.getString(5));
		}
	}
		public void employeefindByName(String name) throws ClassNotFoundException, SQLException

		{
			Connection con = EmployeeImpl.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select *from employeedetails where empName = '"+name+"'");
			while (rs.next())
			{
	System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5));
			}

		}
		
		public void employeefindByDepartment(String department) throws ClassNotFoundException, SQLException

		{
			Connection con = EmployeeImpl.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select *from employeedetails where empDepartment = '"+department+"'");
			while (rs.next())
			{
	System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5));
			}
		}
		public void employeefindBySalary(int salary) throws ClassNotFoundException, SQLException

		{
			Connection con = EmployeeImpl.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select *from employeedetails where empSalary = '"+salary+"'");
			while (rs.next())
			{
	System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getString(5));
			}
		}
		
}



