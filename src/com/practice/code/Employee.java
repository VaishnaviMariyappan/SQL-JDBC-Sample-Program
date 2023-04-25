package com.practice.code;


import java.sql.SQLException;

import java.util.List;

public interface Employee 
{
public void saveEmployee(Employee1 emp)throws ClassNotFoundException, SQLException;

public void updateEmployeeDepartment(Employee1 employee1)throws ClassNotFoundException, SQLException;

public void deleteEmployee(Employee1 employee1)throws ClassNotFoundException, SQLException;

public List<Employee1> displayListOfEmployee()throws ClassNotFoundException,SQLException;

public void employeefindById(Employee1 employee1)throws ClassNotFoundException,SQLException;

public void employeefindByName(Employee1 employee1)throws ClassNotFoundException,SQLException;

public void employeefindByDepartment(Employee1 employee1)throws ClassNotFoundException,SQLException;
}
