package com.bit.test;

public class Calculator 
{
	
//	byte b=12;
//	byte b1;//default value is 0
//	short s=43;
//	int i=234;
//	long l=657;
//	double d=7.8;//default value is 0.0
//	float f=6.7f;//default value is 0/0f
//	char c='u';
//	boolean b=true;//default value is false
//	//when u declare a variable outside  method is called global or instance variable 
//  //which can be used by everywhere
//	//by default there is value for all data type when only declare globally
	
	int a=5;
	int b=9;
	void add() 
	
	{	int c=a+b;
		System.out.println(c); }
	
		//System.out.println(5+9);
		//end of add method
	
	int d=4812;
	int e=321;
	void sub() 
	
	{	int f=d-e;
		System.out.println(f); }
	
	int g=23;
	int h=44;
	void multiply()
		
	{	int i=g*h;
		System.out.println(i); }
	
	int j=81;
	int k=9;
	void divide()
	
	{	int l=j/k;
		System.out.println(l);}
	
	void sqrt()
	
	{	int m=256;
		System.out.println(Math.sqrt(m)); }
	
	int n=5;
	void pow()
		
	{	System.out.println(Math.pow(n,7)); }
	
		public static void main(String[] args) 
	
	{
		System.out.println("this is my first java code");
		
		//how to create an object of a class
		
		Calculator c=new Calculator();
		c.add();
		c.sub();
		c.multiply();
		c.divide();
		c.sqrt();
		c.pow();
	}
}
