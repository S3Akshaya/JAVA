/*Minimum Pizzas
Each pizza consists of 4 slices. There are N friends and each friend needs exactly X slices.
Find the minimum number of pizzas they should order to satisfy their appetite. 
if n=based on 4 means a=(n+3)/4  .......... if n=8, then  a=(n+7/8) .so this is ceiling function*/ 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=s.nextInt();
		    int x=s.nextInt();
		    int ss=n*x;
		    int m=(ss+3)/4;
		    System.out.println(m);
		}

	}
}
