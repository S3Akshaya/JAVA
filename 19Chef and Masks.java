/*Chef and Masks
Chef is shopping for masks. In the shop, he encounters 2 types of masks:

Disposable Masks — cost X but last only 1 day.
Cloth Masks — cost Y but last 10 days.
Chef wants to buy masks to last him 100 days. He will buy the masks which cost him the least. In case there is a tie in terms of cost, Chef will be eco-friendly and choose the cloth masks. Which type of mask will Chef choose? */

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
		    int d=x*100;
		    int c=y*10;
		    if(d<c)
		    {
		        System.out.println("DISPOSABLE");
		    }
		    else if(c<d){
		        System.out.println("CLOTH");
		    }
		    else{
		        System.out.println("CLOTH");
		    }
		}
		

	}
}
