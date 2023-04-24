package com.practice.crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


import java.sql.ResultSet;


 class University implements Department
{
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kamarajuniversitydetails", "root","Vais@123");
		// System.out.println(con);
		return con;
	}

	public void saveUniversity() throws ClassNotFoundException, SQLException
	{
	Connection con = University.getConnection();
		String s1= "insert into department_details values('Histroy',100,8,100)";
		PreparedStatement ps = con.prepareStatement(s1);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
	}
	
	public void updateUniversity() throws ClassNotFoundException, SQLException
	{
		Connection con = University.getConnection();
		String s2= "UPDATE department_details SET departmentName= 'History' where departmentName = 'Histroy'";
		PreparedStatement ps = con.prepareStatement(s2);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
	}
	public void deleteUniversity() throws ClassNotFoundException, SQLException
	{
		Connection con = University.getConnection();
		String s3= "DELETE FROM department_details WHERE departmentName='ComputerScience' ";
		PreparedStatement ps = con.prepareStatement(s3);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
	}
	
	public void universityList() throws ClassNotFoundException, SQLException {
		try {
			Connection con = University.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select *from department_details");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4));
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

		public void universityfindByDepartment(String department) throws ClassNotFoundException, SQLException 
		{
		Connection con = University.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select *from department_details where departmentName = '"+department+"'");
			while (rs.next())
			{
	System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4));
			}
	}
	



}