package org.demo;

public class SwappingWoThird {
	public static void main (String [] args){
		int a=50,b=30;
		
		System.out.println(a);
		System.out.println(b);
		 
		a=a+b;               //50+30=80
		b=a-b;                      //80-30
		a=a-b;                //  80-50
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
