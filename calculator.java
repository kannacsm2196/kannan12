package com.kannan.gitjoining;

public class calculator {

	public static long addition(long a , long b)
	{
		return a+b;
	}
	public static long subtraction(long a , long b)
	{System.out.println("************");
		return a-b;
	}
	
	
	
	
	public static void main(String[] args) {
	
		long first_num = 1000;
		long Second_num= 150;
		System.out.println("The addition of "+first_num+" and "+Second_num+" is: "+addition(first_num, Second_num));
		System.out.println("The Subraction of "+first_num+" and "+Second_num+" is: "+subtraction(first_num, Second_num));
		

	}

}
