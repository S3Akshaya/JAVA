/*For each bill you pay using CRED, you earn X CRED coins.
At CodeChef store, each bag is worth 100 CRED coins.
Chef pays Y number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers X and Y. */ 

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
		    int a=x*y;
		    System.out.println(a/100);
		}

	}
}
