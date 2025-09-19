/* Pooja would like to withdraw X US Dollar from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 US Dollar.

Calculate Pooja's account balance after an attempted transaction.

Input Format
Each input contains 2 numbers X and Y.
X is the amount of cash which Pooja wishes to withdraw.
Y is Pooja's initial account balance.

ip - 42 120.00
op - 120.00
Output Format
Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance. */ 

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		double y=s.nextDouble();
		if(x%5==0 && (x+0.5)<=y)
		{
		    double a=(y-(x+0.5));
		    System.out.printf("%.2f\n",a);
		}
		else{
		    System.out.printf("%.2f\n",y);
		}

	}
}
