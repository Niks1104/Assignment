package com.javaprac;

public class ReverseString {
	
	public static void main(String args[]) 
	{
		String str="Hello Welcome to Java World!!";
		
		//Method I -- using build-in function
		StringBuilder builder = new StringBuilder(str);
		String rev= builder.reverse().toString();
		System.out.println("Reverse String from method I: "+rev);
		
		
		//Method II -- using for loop
		char Array[] = str.toCharArray();
		rev="";
		for(int i=Array.length-1;i>=0;i--)
		{
			rev += Array[i];
		}
		System.out.println("Reverse String from method II: "+rev);
	}

}
