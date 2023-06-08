import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	
		int sum=0;
		int a[]=new int[5];
		a[0]=9;
		a[1]=8;
		a[2]=5;
		a[3]=2;
		a[4]=7;
		
		for(int i=0;i<5;i++)
		
		{
			sum=sum+a[i];
		}
			System.out.println("sum of aray"+sum);
	}
}