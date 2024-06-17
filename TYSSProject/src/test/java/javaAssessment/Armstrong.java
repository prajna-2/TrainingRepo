package javaAssessment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int value=temp;
		int count=0;
		while(num>0) {
			int rem=num%10;
			count++;
			num/=10;
		}
		System.out.println(count);
		
		while(temp>0) {
			int rem=temp%10;
			sum+=test(rem,count);
			temp/=10;
		}
		
		if(value==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not a armstrong");
		}
		
		
	}
	
	
	public static int test(int num, int count) {
		int pow=1;
		for(int i=1;i<=count;i++) {
			pow=pow*num;
		}
		return pow;
	}
	

}
