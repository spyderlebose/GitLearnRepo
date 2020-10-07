package Strings;

import java.util.Scanner;

public class gfg2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of test cases you want");
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    System.out.println("enter the string");
		    String s=sc.next();
		    if(s.charAt(0)>='A'&&s.charAt(0)<='Z')
		    {
		        s=s.toUpperCase();
		    }
		    else
		    {
		        s=s.toLowerCase();
		    }
		    System.out.println(s);
		}
	}
}