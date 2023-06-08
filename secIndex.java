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
		    int i=0;
			System.out.println("Enter array element:");
			
			for( i=0;i<n;i++)
			
		    a[i]=sc.nextInt();
			for(i=0;i<n;i++)
		    System.out.println("\ta["+i+"]="+a[i]);
			for( i=0;i<n;i++)
			{
				if(a[i]%2!=0)
				{
					System.out.println("\ta["+i+"]="+(a[i]+5));
				}
				else
					System.out.println("\ta["+i+"]="+a[i]);
			}
			    
		}
}