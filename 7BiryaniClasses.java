/* Biryani classes
According to a recent survey, Biryani is the most ordered food. Chef wants to learn how to make world-class Biryani from a MasterChef. Chef will be required to attend the MasterChef's classes for 
X
X weeks, and the cost of classes per week is 
Y
Y coins. What is the total amount of money that Chef will have to pay?

Input Format
The first line of input will contain an integer 
T
T — the number of test cases. The description of 
T
T test cases follows.
The first and only line of each test case contains two space-separated integers 
X
X and 
Y
Y, as described in the problem statement. */ 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t = s.nextInt();
		
	    while(t>0)
	    {
	        int x = s.nextInt();	
	        int y = s.nextInt();
	       int m = x*y;
	       System.out.println(m);
	       t--;
	    }
	    
	}
}
