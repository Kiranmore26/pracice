package Logical;

import java.util.Scanner;

public class Fibonacii 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  no :");
		int num=sc.nextInt();
		int ft=1;
		int st=2;
		int tt;
		
		for(int i=0;i<num;i++)
		{
			System.out.print(ft+" ");
			tt=ft+st;
			ft=st;
			st=tt;
		}

	}

}
