package org.demo;

import java.util.Scanner;

public class OddorEven {
	public static void main (String [] args){
		Scanner n =new Scanner (System.in);
		int h = n.nextInt();
		
		if (h%2==0){
			System.out.println("even number");
		}else{
			System.out.println("odd number");
		}
	}

}
