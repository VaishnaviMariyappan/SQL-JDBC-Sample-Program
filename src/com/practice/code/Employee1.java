package com.practice.code;

public class Employee1 
{
	private Integer id;
	private String name;
	private Integer age;
	private String department;
	private Long salary;
	
	public  Employee1()
	{
		
	}
public Employee1(Integer id,String name, Integer age,String department,Long salary)
{
	this.id=id;
	this.name= name;
	this.age=age;
	this.department=department;
	this.salary=salary;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Long getSalary() {
	return salary;
}
public void setSalary(long salary2) {
	this.salary = salary2;
}
@Override
public String toString()
{
	return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", salary="
			+ salary + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge()
			+ ", getDepartment()=" + getDepartment() + ", getSalary()=" + getSalary() + "]";
}

}
