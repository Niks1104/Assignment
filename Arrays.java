package com.javaprac;

import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to enter:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is:");
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}

}

