package com.pack1;


import java.util.*;

import com.pack1.MainClass;

public class Subclass extends MainClass {
	
	Subclass()
	{
		System.out.println("Calling..");
	}

	void dispalyname(String str)
	{
		System.out.println("Entered Name is:  "+str);
		Date d= new Date();
	}
	
	Subclass s;
	Subclass s1 = new Subclass();
	//s1.dispalyname();
	public static void main(String[] args) {
		
	}

}
