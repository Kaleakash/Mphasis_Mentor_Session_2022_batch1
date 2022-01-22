package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name;
	float salary;
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;				// instance variable and local variable have same name 
		this.name = name;
		this.salary = salary;
	}
	void dis() {
		System.out.println(" id is"+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
public class EmployeeTest {
	public static void main(String[] args) throws Exception{
//		Employee emp = new Employee(1, "Raj", 12000);
//		emp.dis();
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp);
//		System.out.println("Object Serialization done successfully");
		
		FileInputStream fis = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp1 = (Employee)ois.readObject();
		emp1.dis();
	}
}
