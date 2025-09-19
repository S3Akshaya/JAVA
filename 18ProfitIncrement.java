
/* Chef recently started selling a special fruit.
He has been selling the fruit for 
X rupees (X is a multiple of 100). He earns a profit of Y rupees on selling the fruit currently.

Chef decided to increase the selling price by 10%. Please help him calculate his new profit after the increase in selling price.

Note that only the selling price has been increased and the buying price is same.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line of input containing two space-separated integers X and Y denoting the initial selling price and the profit respectively.
Output Format 
For each test case, output a single integer, denoting the new profit. */

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
		    int a=x-y;
		    double c=(0.1*x)+x;
		    System.out.println((int)(c-a));
		    
		}

	}
}



