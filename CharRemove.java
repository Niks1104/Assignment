package com.javaprac;
import java.util.*;

public class CharRemove {
	public void removeChar(String str,char ch)
	{
		String str1=str;
		char ch1=ch;
		String newString="";
		char Array[]=str1.toCharArray();
		for(int i=0; i<Array.length;i++)
		{
			if(Array[i]!=ch1)
			{
				newString +=Array[i];
			}
		}
		System.out.println("New String is: "+newString);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CharRemove cr=new CharRemove();
		
		System.out.println("Enter a String and a character:");
		String str=sc.next();
		char ch= sc.next().charAt(0);
		cr.removeChar(str,ch);
		
	}

}
