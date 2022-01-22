package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {

	public static void main(String[] args) {

			//	Pattern pt = Pattern.compile("\\d\\d");
				Pattern pt = Pattern.compile("[9|8]\\d{9}");
				Matcher mt = pt.matcher("7900123458");
				if(mt.matches()) {
					System.out.println("Valid Number");
				}else {
					System.out.println("In Valid Number");
				}

	}

}
