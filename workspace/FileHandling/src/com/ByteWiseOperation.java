package com;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseOperation {

	public static void main(String[] args) throws Exception{
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("enter the name");
//		String name = dis.readLine();
//		ps.println("Name is "+name);
//		ps.println("Enter the id");
//		int id = Integer.parseInt(dis.readLine());			// converting string to int 
//		ps.println("id is "+id);
//		DataInputStream dis = new DataInputStream(System.in);
//		FileOutputStream fos = new FileOutputStream("abc.txt");
//		System.out.println("Enter the text");
//		int ch;
//		while((ch=dis.read()) != '@') {
//				fos.write(ch);				// convert automatically 
//				System.out.print(ch);			// asci 
//				System.out.println((char)ch);	// converted
//		}
		
//		FileInputStream fis = new FileInputStream("D:\\Grunt\\Link.txt");
//		FileOutputStream fos = new FileOutputStream("link.txt");
//		int ch;
//		while((ch=fis.read()) != -1) {			//-1 is EOF 
//			fos.write(ch);
//		}
//		fis.close();
//		fos.close();
		
		FileInputStream fis = new FileInputStream("D:\\Grunt\\Link.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("link.txt");
		int ch;
		while((ch=bis.read()) != -1) {			//-1 is EOF 
			fos.write(ch);
		}
		fis.close();
		fos.close();
	}

}
