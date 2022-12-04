package org.demo;

public class Program {

public static void main (String [] args){
	int sum=0;
	int count=0;
	
	
	for (int j = 0; j <=10; j++) {
		if(j%2==0){                                   //even number 
			
			sum=sum+j;                                  // sum of even
			count++;                                   //count of even
		System.out.println("even number :"+j);
	}
}
	System.out.println("sum of even number :"+sum);
	System.out.println("count of even number :"+count);
}
}
