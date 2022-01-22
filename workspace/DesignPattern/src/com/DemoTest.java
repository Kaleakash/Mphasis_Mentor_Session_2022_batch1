package com;

class Employee {
	private Employee() {}
	public static Employee getInstance() {
		Employee emp = new Employee();
		return emp;
	}
	public void display() {
		System.out.println("Display method");
	}
}
public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		Employee emp = Employee.getInstance();
		emp.display();
		Employee emp1 = Employee.getInstance();
		emp1.display();
	}

}
