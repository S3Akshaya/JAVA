	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=s.nextInt();
		    int rev=0;
		    while(n>0)
		    {
		        int rem=n%10;
		        rev=rev*10+rem;
		        n/=10;
		    }
		       System.out.println(rev); 
    }
	}
}
