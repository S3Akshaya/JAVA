/* You are given 3 numbers A,B and C.

Determine whether the average of A and B is strictly greater than C or not?

NOTE: Average of A and B is defined as (A+B)/2 */
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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    double d=(a+b)/2.0;
		  
		    if(d>c)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		}

	}
}
