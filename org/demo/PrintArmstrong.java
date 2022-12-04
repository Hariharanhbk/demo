package org.demo;

public class PrintArmstrong {
	public static void main (String [] args){
		int count=0;
		
		for (int h = 1; h < 1000; h++) {
			int a,i=0,j=0;
			
			a=h;
			
			 while (a>0) {
				i=a%10;
				j=j+(i*i*i);
				a=a/10;
			}
			 if(h==j){
				 count++;
				 System.out.println(h);
			 }
		}
		System.out.println(count);
	}

}
