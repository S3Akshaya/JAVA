/* 404 Not Found
Chef's website has a specific response mechanism based on the HTTP status code received:

If the response code is 
404
404, the website will return NOT FOUND.
For any other response code different from 
404
404, the website will return FOUND.
Given the response code as 
X
X, determine the website response. */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a==404)
		{
		    System.out.println("NOT FOUND");
		}
		else{
		    System.out.println("FOUND");
		}

	}
}


