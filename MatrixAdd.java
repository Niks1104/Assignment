package com.javaprac;

public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]=new int[][] {{11,22,33},{44,55,66},{77,88,99}};
		int y[][]=new int[][] {{10,20,30},{40,50,60},{70,80,90}};
		int sum[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]=x[i][j]+y[i][j];
			}
		}
		
		System.out.println("Addition of two matrices is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
