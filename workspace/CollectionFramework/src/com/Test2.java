package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		//HashSet hs = new HashSet();
		//LinkedHashSet hs = new LinkedHashSet();
		TreeSet hs = new TreeSet();
		System.out.println("Size "+hs.size());
		hs.add(30);
		hs.add(20);
		hs.add(10);
		hs.add(10);
		//hs.add(10.20);
		hs.add(70);
		hs.add(80);
		hs.add(90);
		System.out.println(hs);
		hs.remove(20);
		System.out.println(hs);
		System.out.println("Search "+hs.contains(20));
		System.out.println("Search "+hs.contains(10));
		System.out.println("Size "+hs.size());
		hs.clear();
		System.out.println("Size "+hs.size());
	
	}

}
