package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {

	public static void main(String[] args) {
		//String str = "[abc]abc";		//1st character can be a or b or c		then abc character 
		//String str = "[^abc]abc";		//1st character apart from a or b or c	then abc character 
		String str = "[a-m]abc";		//1st character a to m range then abc character 
		String str1 = "nabc";
		Pattern pt = Pattern.compile(str);
		Matcher mt = pt.matcher(str1);
		if(mt.matches()) {
			System.out.println("yes match");
		}else {
			System.out.println("Not match");
		}
	}

}
