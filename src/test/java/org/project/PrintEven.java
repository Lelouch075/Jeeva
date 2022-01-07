package org.project;

import org.testng.annotations.Test;

public class PrintEven {
	@Test
	public void sumOfEven(int a,int b) {
		int count=0;
		int countodd=0;
		
		for (int i = a; i < b; i++) {
			
			if(i%2==0) {
				
				//System.out.println(i);
				count=i+count;
			}
			
			if(i%2==1) {
				countodd=i+countodd;
				
			}
			
		}
		
		System.out.println("The Sum of Even "+count);
		
		System.out.println("The Sum of Odd "+ countodd);
	}
	
	
		
		public static void main(String[] args) {
			PrintEven p =new PrintEven();
			p.sumOfEven(10, 100);
		}
		
	
	

}
