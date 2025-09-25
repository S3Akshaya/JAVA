/* A problem setter is called an expert if at least 50% of their problems are approved by Chef.

Munchy submitted X problems for approval. If Y problems out of those were approved, find whether Munchy is an expert or not. */

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
		    	int x=s.nextInt();
		int y=s.nextInt();
		double a=0.5*x;
		if(y>=a)
		{
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		    
		}
	

	}
}
