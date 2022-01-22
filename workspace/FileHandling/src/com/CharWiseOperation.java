package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharWiseOperation {

	public static void main(String[] args) throws Exception {
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the name");
//		String name = br.readLine();
//		System.out.println("name is "+name);
//		System.out.println("Enter the id");
//		int id  = Integer.parseInt(br.readLine());
		FileReader fr = new FileReader("abc.txt");
		FileWriter fw = new FileWriter("mno.txt");
		int ch;
		while((ch=fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
