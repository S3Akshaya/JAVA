/* Determine the Score
Chef appeared for a placement test.

There is a problem worth 
X
X points. Chef finds out that the problem has exactly 
10
10 test cases. It is known that each test case is worth the same number of points.

Chef passes 
N
N test cases among them. Determine the score Chef will get.

NOTE: See sample explanation for more clarity.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a = new Scanner(System.in);
		int b=a.nextInt();
		for(int i=0;i<b;i++)
		{
		    int x=a.nextInt();
		    int n=a.nextInt();
		    int y=(x/10)*n;
		    System.out.println(y);
		}
		

	}
}
