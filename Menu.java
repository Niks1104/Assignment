package com.javaprac;
import java.util.*;

public class Menu {
	public void displayMenu()
	{
		System.out.println("1.Snack \n2.Lunch \n3.Dinner \n4.Drinks");
	}
	
	public void displaySnack()
	{
		System.out.println("Sr.No \t Item \t\t Quantity \t Price");
		System.out.println("1 \t Idli \t\t 1 \t\t 40");
		System.out.println("2 \t Dosa \t\t 1 \t\t 50");
		System.out.println("3 \t Uttapam \t 1 \t\t 30");
		System.out.println("4 \t Poha/Upma \t 1 \t\t 20");
		
	}
	
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Do you want to order food? [Y/N]:");
		char response=sc.next().charAt(0);
		
		while(response=='y' || response=='Y')
		{
			Menu m=new Menu();
			m.displayMenu();
			System.out.println("Enter choice from menu:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					m.displaySnack();
					System.out.println("Order your food:");
					String ord=sc.next();
					switch(ord)
					{
					case "Idli":
					case "idli":
						System.out.println("Enter Quantity: ");
						int qty=sc.nextInt();
						int price=qty*40;
						sum=sum+price;
						break;
						
					case "Dosa":
					case "dosa":
						System.out.println("Enter Quantity: ");
						int qty1=sc.nextInt();
						int price1=qty1*50;
						sum=sum+price1;
						break;
					
					case "Uttapam":
					case "uttapam":
						System.out.println("Enter Quantity: ");
						int qty2=sc.nextInt();
						int price2=qty2*30;
						sum=sum+price2;
						break;
						
					case "Poha":
					case "poha":
					case "Upma":
					case "upma":
						System.out.println("Enter Quantity: ");
						int qty3=sc.nextInt();
						int price3=qty3*20;
						sum=sum+price3;
						break;
					}
			}
			System.out.println("Do you want to order food? [Y/N]:");
			response=sc.next().charAt(0);
		}

		System.out.println("Bill of your order is: "+ sum);
		
	}

}
