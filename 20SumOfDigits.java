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
		    int sum=0;
		    while(n>0) //bcoz we dont know number of digits that is to be inputted, so use while loop
    
		    {
		        int m=n%10;
		        sum+=m;
		        n=n/10;
		    }
		    System.out.println(sum);
		    
		    
		}

	}
}
