import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("How many element you want to enter:");
		int n=sc.nextInt();
		int index=0,min=a[0],max=a[0],thirdlarg=a[0];
		
		System.out.println("\tenter the element:");
		
		for(int i=0;i<n;i++)
			
		a[i]=sc.nextInt();
		
		max=a[0];
		
		for(int i=0;i<n;i++)
		{
				if(max<a[i])
				{
					max=a[i];
				}
				else
				{
					min=a[i];
				}
				thirdlarg=min-1;
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>thirdlarg&&a[i]<max)
			{
				thirdlarg=a[i];
				index=i;
			}
		}
		System.out.println("\tthirdlarg element is: a["+index+"]="+thirdlarg);
	}
}