/* hef's dog binary hears frequencies starting from 
67
67 Hertz to 
45000
45000 Hertz (both inclusive).

If Chef's commands have a frequency of 
X
X Hertz, find whether binary can hear them or not.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of a single integer 
X
X - the frequency of Chef's commands in Hertz.
Output Format
For each test case, output on a new line YES, if binary can hear Chef's commands. Otherwise, print NO.

The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same. */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    int a=s.nextInt();
		    if(a>=67 && a<=45000)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
