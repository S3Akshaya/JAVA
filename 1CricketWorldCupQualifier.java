/* The cricket World Cup has started in Chefland. There are many teams participating in the group stage matches. Any team that scores 
12
12 or more points in the group stage matches qualifies for the next stage.
  Input   3
Output   No  */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
		if(b>=12)
		{
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}

	}
}
