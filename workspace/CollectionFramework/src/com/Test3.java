package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
class Employee {
	int id;
	String name;
}
public class Test3 {

	public static void main(String[] args) {
//		Stack ss = new Stack();
//		ss.push(100);
//		ss.push(200);
//		ss.push(300);
//		System.out.println(ss);
//		System.out.println("remove "+ss.pop());		// remove top most element 
//		System.out.println(ss);	
//		System.out.println("remove "+ss.peek());		// it display top most element 
//		System.out.println(ss);
//		ArrayList al = new ArrayList();
//		int a=10;		// primitive value 
//		Integer b = new Integer(a);			// convert primitive to object. 
//		al.add(b);
//		al.add(20);			// auto-boxing : converting primitive to objects. 
//		al.add("Ravi");
//		al.add(20.20);
//		
//		Object obj = al.get(3);		// retrieve in object class reference 
//		Integer  i = (Integer)obj;		// type casting for specific object 
//		int n = i.intValue();				// convert integer to primitive 
//		System.out.println(n);
		// Collection framework with generics 
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);			// auto-boxing :converting primitive object 
		al.add(20);
		al.add(30);
		
		
		int n=	al.get(0);		// auto-unboxing : converting object to primitive 
		System.out.println(n);
		HashMap<Integer, Employee> hm = new HashMap<>();
		Employee emp1 = new Employee();
		emp1.id=100;
		emp1.name="Ravi";
		
		hm.put(1, emp1);
		//hm.put(2, "Ravi");
	}

}
