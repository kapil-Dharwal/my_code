import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
	  a[0]=9;
	  a[1]=5;
	  a[2]=3;
	  a[3]=2;
	  a[4]=8;
	    for(int i=0;i<5;i++)
			System.out.println("\ta["+i+"]="+a[i]);
	}
}