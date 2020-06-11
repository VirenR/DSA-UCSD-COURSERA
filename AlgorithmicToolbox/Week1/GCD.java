import java.util.*;

public class GCD
{
	public static long gcd(int n,int m)
	{

		long res = 1;
	/*  
		
		O(n) solution

		for(int i = 1; i<n+m; i++)
		{
			if(n%i==0 & m%i==0)
			{
				res = i;
			}
		}

	*/

	/* Euclidian Method to find GCD.....Optimised Solution */	

		if (m==0)
			return n;
		else
		{
			res = n%m;

			return gcd(m,(int)res);
		}

	}

	public static void main(String[] args)
	{

		/* Driver Code */

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int m = sc.nextInt();

		long res = gcd(n,m);

		System.out.println(res);

	}
}