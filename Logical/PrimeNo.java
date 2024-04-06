package Logical;

import java.util.Scanner;

public class PrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		for(int i=2;i<100;i++)
		{
			if(isprime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public  static boolean isprime(int num)
	{
		if(num<1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
