package org.demo;

public class ReverseTheNumber {
	public static void main (String [] args){
	int input=123456789;
	int a,i=0,j=0;
	
	a=input;
	while (a>0) {
		i=a%10;                 // 45
		j=(j*10)+i;            //  45
		a=a/10;               //      
	}
	System.out.println(j);
	}
}
