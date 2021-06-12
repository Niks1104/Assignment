package com.javaprac;
import java.util.*;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num + " x " + i + " = " + num*i);
			i++;
		}
	}

}
