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
		    int l=n%10;
		    int f=n;
		    while(f>=10)
		    {
		        f=f/10;
		    }
		    System.out.println(l+f);
		    
		}

	}
}
