/* Chef classifies a day to be either rainy, cloudy, or clear.
In a particular week, Chef finds X days to be rainy and Y days to be cloudy.
Find the number of clear days in the week. */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner a=new Scanner(System.in);
		int rain=a.nextInt();
		int cloud=a.nextInt();
		int clear;
		clear = 7 - (rain+cloud);
		System.out.println(clear);

	}
}
