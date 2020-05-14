package com.learning.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		//Defining object of the string
		String val1=new String("Hello");
		
		//initializing string variable
		String val2="Java";
		
		System.out.println("using equals method");
		//we are comparing the object with variable using equals method
		if(val1.equals(val2))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		System.out.println("using '==' operator");
		//we are comparing the object with variable using '=='
		if(val1==val2)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
				

	}

}
