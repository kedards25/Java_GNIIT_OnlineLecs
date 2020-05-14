package com.learning.enumdemo;


enum COLORS{RED,BLUE,WHITE,GREEN};

public class EnumDemo {

	void showColor(COLORS color)
	{
		switch(color)
		{
			case RED:
				System.out.println("You chose RED color");
				break;
			case BLUE:
				System.out.println("You chose BLUE color");
				break;
			case GREEN:
				System.out.println("You chose GREEN color");
				break;
			case WHITE:
				System.out.println("You chose WHITE color");
				break;
		}
	}
	
	void showEnumColors()
	{
		for(COLORS color:COLORS.values())
		{
			System.out.println(color);
		}
	}
	
	public static void main(String[] args) {
		EnumDemo enumDemo=new EnumDemo();
		//enumDemo.showColor(COLORS.GREEN);
		enumDemo.showEnumColors();

	}

}
