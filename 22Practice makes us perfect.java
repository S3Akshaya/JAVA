/* Most programmers will tell you that one of the ways to improve your performance in competitive programming is to practice a lot of problems.

Our Chef took the above advice very seriously and decided to set a target for himself.

Chef decides to solve at least 10 problems every week for  4 weeks.
Given the number of problems he actually solved in each week over 4 weeks as a,b,c,d
​
 , output the number of weeks in which Chef met his target. */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int count=0;
		if(a>=10)
		{
		    count+=1;
		}
		if(b>=10)
		{
		    count+=1;
		}
		if(c>=10)
		{
		    count+=1;
		}
		if(d>=10)
		{
		    count+=1;
		}
		System.out.println(count);

	}
}
