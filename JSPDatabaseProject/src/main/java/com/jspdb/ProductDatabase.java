package com.jspdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

import com.jspdb.ProductDetail;

public class ProductDatabase {
	
	public static int register(ProductDetail pd){
		int status=0;
	try
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sampledb?"+"user=root & password=root");
		Statement st=conn.createStatement();
		status=st.executeUpdate("insert into product values("+pd.getId()+",'"+pd.getCategory()+"','"+pd.getName()+"',"+pd.getPrice()+")");
		
	}
		catch (ClassNotFoundException | SQLException  e) {
		
		e.printStackTrace();
		} 
		return status;
	}
	
	public static int modify(ProductDetail pd){
		int status=0;
	try
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sampledb?"+"user=root & password=root");
		Statement st=conn.createStatement();
		status=st.executeUpdate("update product set category='"+pd.getCategory()+"', name='"+pd.getName()+"', price="+pd.getPrice()+"where id="+pd.getId());
		
	}
		catch (ClassNotFoundException | SQLException  e) {
		
		e.printStackTrace();
		} 
		return status;
	}
	
	public static int delete(ProductDetail pd){
		int status=0;
	try
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sampledb?"+"user=root & password=root");
		Statement st=conn.createStatement();
		status=st.executeUpdate("delete from product where id="+pd.getId() + " and name='"+pd.getName()+"'");
		
	}
		catch (ClassNotFoundException | SQLException  e) {
		
		e.printStackTrace();
		} 
		return status;
	}
	
	public static List display(){
		List product = new ArrayList();
	try
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sampledb?"+"user=root & password=root");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from product");
		while(rs.next())
		{
			ProductDetail pd=new ProductDetail();
			pd.setId(rs.getInt(1));
			pd.setCategory(rs.getString(2));
			pd.setName(rs.getString(3));
			pd.setPrice(rs.getFloat(4));
			product.add(pd);
		}
		
	}
		catch (ClassNotFoundException | SQLException  e) {
		
		e.printStackTrace();
		} 
		return product;
	}

}
