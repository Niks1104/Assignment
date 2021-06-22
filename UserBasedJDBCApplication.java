package com.jdbc;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class UserBasedJDBCApplication {
	
	public static void displayChoice()
	{
		System.out.println("What do you want to do?");
		System.out.println(" 1. Add\n 2. Modify\n 3. Delete\n 4. Display");
	}
	
	public static void Add(int roll, String fname, String lname, String std, long mobile)
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sampledb?"+"user=root & password=root");
		Statement st=conn.createStatement();
		st.executeUpdate("insert into Students(roll_no,first_name,last_name,standard,mobile) values("+roll+",'"+fname+"','"+lname+"','"+std+"',"+mobile+")");
		
		}
	
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void Modify(int roll, String fname, String lname, String std, long mobile)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sampledb?"+"user=root & password=root");
			Statement st=conn.createStatement();
			st.executeUpdate("update Students set first_name='"+fname+"',last_name='"+lname+"',standard='"+std+"',mobile="+mobile+" where roll_no="+roll);		
		}
		
		catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void Delete(int roll)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sampledb?"+"user=root & password=root");
			Statement st=conn.createStatement();
			st.executeUpdate("delete from Students where roll_no="+roll);
		}
		
		catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void Display()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sampledb?"+"user=root & password=root");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from Students");
			System.out.println("Rollno \t  FirstName  \t  LastName  \t  Standard  \t  Contact");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" \t  "+rs.getString(2)+" \t  "+rs.getString(3)+" \t  "+rs.getString(4)+" \t\t "+rs.getLong(5));
			}
			
		}
		
		catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}
	

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			char reply;
			System.out.println("Welcome to Student Database");
			do
			{
				displayChoice();
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.print("Roll No:");
					int roll=sc.nextInt();
					System.out.print("First Name:");
					String fname=sc.next();
					System.out.print("Last Name:");
					String lname=sc.next();
					System.out.print("Standard:");
					String std=sc.next();
					System.out.print("Contact:");
					Long mobile=sc.nextLong();
					Add(roll, fname,lname, std, mobile);
					System.out.println("Data Successfully Entered");
					break;
				case 2:
					System.out.println("Enter Roll No whose record you want to modify");
					roll=sc.nextInt();
					System.out.println("Enter new data");
					System.out.print("First Name:");
					fname=sc.next();
					System.out.print("Last Name:");
					lname=sc.next();
					System.out.print("Standard:");
					std=sc.next();
					System.out.print("Contact:");
					mobile=sc.nextLong();
					Modify(roll, fname,lname, std, mobile);
					System.out.println("Modified Successfully");
					break;
				case 3:
					System.out.println("Enter Roll No whose record you want to delete:");
					roll=sc.nextInt();
					Delete(roll);
					System.out.println("Delete successfully");
					break;
				case 4:
					Display();
					break;
				default:
					System.out.println("Enter valid choice");
			}
			System.out.println("Do you want to continue?");
			reply=sc.next().charAt(0);
		}while(reply=='y' || reply=='Y');
	}

}
