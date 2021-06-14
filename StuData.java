package com.javaprac;
import java.util.*;


public class StuData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students:");
		int stu=sc.nextInt();
		String[] names=new String[stu];
		int[] sub1=new int[stu];
		int[] sub2=new int[stu];
		int[] sub3=new int[stu];
		int[] sub4=new int[stu];
		int[] total=new int[stu];
		
		for(int i=0; i<stu;i++)
		{
			System.out.println("Enter Name and marks for "+(i+1)+" student in four subjects");
			names[i]=sc.next();
			sub1[i]=sc.nextInt();
			sub2[i]=sc.nextInt();
			sub3[i]=sc.nextInt();
			sub4[i]=sc.nextInt();
			total[i]=sub1[i]+sub2[i]+sub3[i]+sub4[i];
		}

		System.out.println("Names\tSub1\tSub2\tSub3\tSub4\tTotal");
		for(int i=0; i<stu; i++)
		{
			System.out.println(names[i]+"\t"+sub1[i]+"\t"+sub2[i]+"\t"+sub3[i]+"\t"+sub4[i]+"\t"+total[i]);
		}

	}

}
