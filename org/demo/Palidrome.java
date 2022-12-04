package org.demo;

public class Palidrome {
	  public static void main (String [] args){
		  int input=121;
		  int a,i=0,j=0;
		  a=input;
		  while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		  if(input==j){
		  System.out.println("palidrome");
		  }else{
			  System.out.println("not a palidrome");
			  
		  }
	  }

}
