/* Chef Plays Ludo
Chef is playing Ludo. According to the rules of Ludo, a player can enter a new token into the play only when he rolls a 6 on the die.
In the current turn, Chef rolled the number X on the die. Determine if Chef can enter a new token into the play in the current turn or not.
Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer X — the number rolled by the Chef on the die.
Output Format
For each test case, output YES if the Chef can enter a new token in the game. Otherwise, output NO.
You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical). */ 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = s.nextInt();
		    if(n==6)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}
}
