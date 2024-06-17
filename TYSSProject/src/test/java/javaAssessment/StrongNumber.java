package javaAssessment;

import java.util.Scanner;


public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		int sum=0;
		
		int temp=num;
		while(num>0) {
			int rem=num%10;
			sum+=fact(rem);
			num/=10;
		}
		
		if(temp==sum) {
			System.out.println("the given number is strong number");
		}
		else {
			System.out.println("the given number is not a strong number");

		}

	}
	
	public static int fact(int num) {
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact*=i;
		}
		return fact;
	}
	

}
