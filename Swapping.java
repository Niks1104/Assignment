package com.javaprac;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Before swap: \n num1= "+num1+" num2= "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swap: \n num1= "+num1+" num2= "+num2);
		

	}

}
