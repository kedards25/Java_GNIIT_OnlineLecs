package com.learning.constructorinvocationdemo;

//Constructor invocation takes place from parent to child
//Destructor invocation takes place from child to parent
//Destruction of unused variables after execution is taken care by 
//Garbage Collector feature of Java so we need not to declare and invoke the destructor
class DemoP
{
	int v1;
		public DemoP()
		{
			System.out.println("Parent class constructor invoked");
		}
		
		public DemoP(int val,double n1)
		{
			v1=val;
			System.out.println("Parameterized constructor from Parent class invoked "+v1+" "+n1);
		}
}

public class ConstructorInvocationInheritance extends DemoP {

	int value;
	//call to the parent constructor is given by default by child class
	//constructor in case of default/no-arg constructor
	ConstructorInvocationInheritance()
	{
		System.out.println("Child class constructor invoked");
	}
	
	
	//An explicit call to the parent constructor has to be given by child class
	//constructor in case of parameterized constructor
	ConstructorInvocationInheritance(int num,int numbr,double num1)
	{
		//call to the super must be the first statement in child class constructor
		super(numbr,num1);
		value=num;
		
		System.out.println("Parameterized constructor from child class invoked "+value);
	}
	
	public static void main(String[] args) {
		 
		ConstructorInvocationInheritance demo=new ConstructorInvocationInheritance();
		ConstructorInvocationInheritance demo1=new ConstructorInvocationInheritance(15,25,5.6);
		

	}

}
