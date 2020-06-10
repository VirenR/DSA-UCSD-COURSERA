import java.util.*;

public class MaxPairwiseProduct1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] arr = new long[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextLong();
		}

		long max1 = 0;
		long max2 = 0;
		int index = 0;
		for(int i=0;i<n;i++)
		{
			if((long)arr[i]>max1)
			{
				max1 = arr[i];
				index = i;
			}
		}

		for(int i=0;i<n;i++)
		{
			if((index != i) && ((long)arr[i]>max2))
			{
				max2 = arr[i];
			}
		}
		long res = max1*max2;
		System.out.println(res);
	}
}