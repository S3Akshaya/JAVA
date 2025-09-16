/* Chess Time
Chef has recently started playing chess, and wants to play as many games as possible.

He calculated that playing one game of chess takes at least 
20
20 minutes of his time.

Chef has 
N
N hours of free time. What is the maximum number of complete chess games he can play in that time?

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of a single line containing a single integer, 
N
N */

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
		for(int i=0;i<n;i++)
		{
		    int x=s.nextInt();
		    int a=(60*x);
		    System.out.println(a/20);
		}

	}
}
