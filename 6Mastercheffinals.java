/*Chef has been working hard to compete in MasterChef.He is ranked X out of all contestants. However, only 10 contestants would be selected for the finals. Check whether Chef made it to the top 10 or not?
first line of input will contain a single integer T, denoting the number of test cases. Each test case consists of one integers X — the current rank of Chef.

Input
4
15
10
1
50   
output  
NO
YES
YES
NO*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		while(b > 0)
		{
		    int c = a.nextInt();
		    if(c>10)
		    {
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		    b--;
		}

	}
}
