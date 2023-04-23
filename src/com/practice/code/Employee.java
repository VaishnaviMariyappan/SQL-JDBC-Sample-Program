package com.practice.code;


import java.sql.SQLException;

public interface Employee 
{
public void saveEmployee()throws ClassNotFoundException, SQLException;
public void updateEmployee()throws ClassNotFoundException, SQLException;
public void deleteEmployee()throws ClassNotFoundException, SQLException;
public void employeeList()throws ClassNotFoundException, SQLException;
public void employeefindById(int id)throws ClassNotFoundException,SQLException;
public void employeefindByName(String name)throws ClassNotFoundException,SQLException;
public void employeefindByDepartment(String department)throws ClassNotFoundException,SQLException;
public void employeefindBySalary(int salary)throws ClassNotFoundException,SQLException;

}
