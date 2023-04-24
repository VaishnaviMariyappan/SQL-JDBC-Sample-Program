package com.practice.crudoperations;

import java.sql.SQLException;

public interface Department 
{
public void saveUniversity() throws ClassNotFoundException , SQLException;
public void updateUniversity()throws ClassNotFoundException, SQLException;
public void deleteUniversity() throws ClassNotFoundException, SQLException;
public void universityList() throws ClassNotFoundException, SQLException;
public void universityfindByDepartment(String department) throws ClassNotFoundException, SQLException;
}
