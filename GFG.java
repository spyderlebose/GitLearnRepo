package Strings;

import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of test cases you want");
		int T=sc.nextInt();
			for(int i=0;i<T;i++)
		{
			System.out.println("enter the string");
		    String s=sc.next();
		     
		    int count =0;
		    for(int j=0;j<s.length();j++)
		    {
		        if(s.charAt(j)>=65 && s.charAt(j)<=91)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}		
}