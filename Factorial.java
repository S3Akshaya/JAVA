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
		int fact=1;
		
		for(int i=0;i<n;i++)
		{
		    int num=s.nextInt();
		    for(int j=1;j<=num;j++)
		    {
		        fact=fact*j;
		    }
		    System.out.println(fact);
		    
		}
	}
}
