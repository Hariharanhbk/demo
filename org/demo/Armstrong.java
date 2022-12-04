package org.demo;

public class Armstrong {
 
	public static void main (String []args){
		int input=153;
		int a,i=0,j=0;
		
		a=input;
		
		while (a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
		}
		if (input==j) {
			System.out.println("armstrong");
			
		}else{
			System.out.println("not a armstrong");
		}
	}
}
