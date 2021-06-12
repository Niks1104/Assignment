package com.javaprac;
import java.util.*;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age:");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("You are eligible for casting Vote");
		}
		else
		{
			System.out.println("You are not eligible for casting Vote");
		}
	}

}
