package Logical;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a no : ");
		int num=sc.nextInt();
		int temp ,store=0;
		int og=num;
		while(num>0)
		{
			temp=num%10;
			store=store*10+temp;
			num=num/10;
		}
		
		if(store==og)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}
