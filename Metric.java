import java.lang.String;
import java.util.Scanner;
class Metric
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int a[][]=new int [3][3];
			int i,j,n,m;
			
			System.out.println("enter the dimension of metrix:");
			m=sc.nextInt();
			n=sc.nextInt();
			System.out.print("enter the element of metrix:");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("matrix element are:");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print("\t"+a[i][j]);
				}
				System.out.println(" ");
			}
			
		}
}