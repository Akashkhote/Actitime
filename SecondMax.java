package arrys;

public class SecondMax
{
	public static void main(String[] args) 
	{
		int a []= {9,8,6,4,3,1,7};
		
		int max=a[0];
		int secmax=a[1];
		
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]>max) 
			{
				secmax=max;
				max=a[i];
			}
			else if (a[i]>secmax && a[i]!=max) 
			{
				secmax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
	} 
}
