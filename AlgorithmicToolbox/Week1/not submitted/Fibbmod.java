import java.util.*;

public class Fibbmod
{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		long m = sc.nextLong();

		long[] arr = new long[(int)n+1];

		if (n==0)
			System.out.println(0);

		else if (n==1)
			System.out.println(1);

		else if(n>=2)
		{
			arr[0] = 0;
			arr[1] = 1;
			for(long i=2;i<=n;i++)
			{
				arr[(int)i] = (arr[(int)i-1] + arr[(int)i-2]) % m;
			}
			System.out.println(arr[(int)n]);
		}

	}
}