package Logical;

import java.util.Scanner;

public class Greatest_No 
{
	public static void main(String[] args) 
	{
		int greatest=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
				for(int i=1;i<=5;i++)
				{
					int number=sc.nextInt();
					if(number>greatest)
					{
						greatest=number;
					}
				}
				System.out.println("The Greatest number is :  "+greatest);
	}
}
