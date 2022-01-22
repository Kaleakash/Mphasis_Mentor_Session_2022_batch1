package com;

import java.util.HashSet;
class A {}
class B {}
public class Test1 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("Size is "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(10);
		hs.add(20.20);
		hs.add(true);
		hs.add("Ravi");
		A obj1 = new A();
		hs.add(obj1);
		B obj2 = new B();
		hs.add(obj2);
		System.out.println(hs);
	}

}
