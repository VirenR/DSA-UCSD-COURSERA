import java.util.*;

public class LCM
{
	
/*
	public static long lcm(Long n,Long m)
	{
		long res = 0;

		O(n) complexity algorithm , We have to optimize it.

		for(int i=1; i<=n*m; i++)
		{
			if(i%n==0 && i%m==0)
			{
				res = i;
				break;
			}
		}
		if(res==0)
			return n*m;
		else
			return res;
	}
*/
	/*We will use "lcm*gcd = n*m" method to find lcm to optimize our code.*/

	public static long gcd(long n, long m)
	{
		long res = 1;

		if(m==0)
			return n;
		else
		{
			res = n%m;
		
			return gcd(m,(int)res);
		}
	}

	/*Driver code*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		long m = sc.nextLong();

		long res = (n*m)/gcd(n,m);

		System.out.println(res);

	}
}