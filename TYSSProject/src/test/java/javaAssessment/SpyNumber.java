package javaAssessment;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int psum = 1,asum=0;
		while(num>0) {
			int rem=num%10;
			asum+=rem;
			psum*=rem;
			num/=10;
		}
		if (asum==psum) {
			System.out.println("spy number");
			
		}
		else {
			System.out.println("not a spy number");
		
	}
		

	}

}
