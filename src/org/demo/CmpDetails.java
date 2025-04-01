package org.demo;

import java.util.ArrayList;
import java.util.List;

public class CmpDetails {

	public static void main(String[] args) { 
		
		
		//Interface refname= new ClassName();
		
		List l=new ArrayList();
		
		l.add(10);
		l.add(1234.67f);
		l.add("Java");
		l.add('M');
		l.add(987654321);
		l.add(10);
		
		System.out.println(l);
		
		//To find the size of the list
		int a = l.size();
		System.out.println("Size of the list is:"+a);
		
		//To get the particular value from the list using index position
		Object b = l.get(5);
		System.out.println(b);
		
		System.out.println("New commandss");
		System.out.println("my next command");
		System.out.println("completed");
		System.out.println("we need push code in sub branch");
		System.out.println("updated");
		System.out.println("Thiru's push");
	}
	
	
}
