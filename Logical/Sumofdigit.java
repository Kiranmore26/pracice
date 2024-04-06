package Logical;

import java.util.Scanner;

public class Sumofdigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no :");
		int num=sc.nextInt();
		int temp,store=0,Final=0;
		
		while(num>0)
		{
			temp=num%10;
			store=store+temp;
			num=num/10;
		}
		
		//adding till single digit
		while(store>0)
		{
			int temp2=store%10;
			Final=Final+temp2;
			store=store/10;
		}
		System.out.println(Final);
		
		
	}
}
