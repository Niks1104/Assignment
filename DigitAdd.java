package com.javaprac;

public class DigitAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=0; num<=1000; num++)
		{
			int sum=0, rem=0;
			int temp=num;
			while(temp>0)
			{
				rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
			System.out.println("Sum of digits of "+num+" is "+ sum);	
		}
	}

}
