package Logical;

import java.util.Scanner;

public class Practice 
{
	public static void main(String[] args) 
	{	Scanner sc= new Scanner(System.in);
		System.out.println("ENter a no ");
		int num=sc.nextInt();
		int temp;
		int store=0;
		
		while(num>0)
		{
			temp=num%10;
			store=store+temp;
			num=num/10;
		}
		
		int temp2;
		int store2=0;
		if(store>0)
		{
			temp2=store%10;
			store2=store2+temp2;
			store=store/10;
		}
		
		System.out.println(store2);
	
	}
}
