package Logical;

import java.util.Scanner;


public class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no ");
		int num=sc.nextInt();
		int temp,og = num,store=0;
		
		while(num>0)
		{
			temp=num%10;
			store=store+temp*temp*temp;
			num=num/10;
		}
		
		if(store==og)
		{
			System.out.println("It is a armstrong");
		}
		else
		{
			System.out.println("It is not a armstrong");
		}
		
	}
}
