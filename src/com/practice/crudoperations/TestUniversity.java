package com.practice.crudoperations;

import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;


public class TestUniversity 

	{

		public static void main(String[] args) throws ClassNotFoundException,SQLException
		
		{
			University u = new University();
			//u.saveUniversity();
			//u.updateUniversity();
			//u.deleteUniversity();
			//u.universityList();
             //getConnection;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Department:");
			String s1 = sc.nextLine();
			u.universityfindByDepartment(s1);
			
}
}