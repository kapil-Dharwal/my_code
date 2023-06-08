import java.lang.String;
import java.util.Scanner;
class Sorting 
{
    public static void main(String[]args)
    {
		Scanner sc=new Scanner(System.in);
		int n=5,min,pos;
		int a[]=new int [10];
		System.out.println("After Swaping_______:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before Swaping______:");
		int count=0;
		for(int i=0;i<n;i++)
		{
			min=a[i];
			pos=i;
			for(int j=i+1;j<n;j++)
			{
				if(min>a[j])
				{
				    min=a[j];
					pos=j;
				}
			}
			a[pos]=a[i];
		    a[i]=min;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"");
		}
	}
}