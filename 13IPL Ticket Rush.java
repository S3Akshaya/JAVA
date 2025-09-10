/* IPL Ticket Rush
DAIICT college students want to attend an IPL match.

A total of 
N
N students from the college want to go while only 
M
M tickets are available for the match.

Determine how many students won't be able to book tickets.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of two space-separated integers 
N
N and 
M
M — the number of students wants to go and the total number of tickets available, respectively. There are 
5
5 students who want to go, and only 
3
3 tickets are available. Hence 
2
2 students won't be able to get tickets.  There are 
8
8 students who want to go, and 
8
8 tickets are available. So, every one of them will get the tickets.  */

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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    if(a<b || a==b)
		    {
		        System.out.println(0);
		        
		    }
		    else{
		        System.out.println(a-b);
		    }
		    
		}
		

	}
}


