/* Chef and Candies
There are N children and Chef wants to give them 1 candy each. Chef already has X candies with him. To buy the rest, he visits a candy shop. In the shop, packets containing exactly 4 candies are available.
Determine the minimum number of candy packets Chef must buy so that he is able to give 1 candy to each of the N children. */

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
		    int a=Math.max(0,n-x);
		    System.out.println((a+3)/4);
		    
		}

	}
}
