/* Candy Division
There are three friends and a total of 
N
N candies.
There will be a fight amongst the friends if all of them do not get the same number of candies.

Chef wants to divide all the candies such that there is no fight. Find whether such distribution is possible.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of a single integer 
N
N - the number of candies. */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		i=0;
		while(i++ < n)
		{
		    int a=s.nextInt();
		    if(a%3==0)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
