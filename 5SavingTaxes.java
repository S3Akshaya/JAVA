/* In Chefland, everyone who earns strictly more than Y rupees per year, has to pay a tax to Chef. Chef has allowed a special scheme where you can invest any amount of money and claim exemption for it.
You have earned X (X>Y) rupees this year. Find the minimum amount of money you have to invest so that you don't have to pay taxes this year.

Input Format
The first line of input will contain a single integer T denoting the number of test cases.
Each test case consists of a single line of input consisting of two space separated integers X and Y denoting the amount you earned and the amount above which you will have to pay taxes.

input         output
4         
4 2            2
8 7            1
5 1            4
2 1            1

Test case 2
The amount above which you will have to pay taxes is 7. Since you earn 8 rupees, you need to invest at least 1 rupees.  */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a = new Scanner(System.in);
		int tax = a.nextInt();
		while(tax>0)
		{
		    int x = a.nextInt();
		    int y = a.nextInt();
		    int z;
		    z = x-y;
		    System.out.println(z);
		    tax--;
		
		}
		

	}
}
