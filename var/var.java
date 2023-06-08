import java.lang.String;
import java.util.Scanner;
class VarJava
{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			var a;
			System.out.println("enter the number");
			a=sc.nextInt();
			System.out.println(a);
		}
}
/*List<String> myList = Arrays.asList("a", "b", "c");
for (var element : myList) {...}  // infers String

for (var counter = 0; counter < 10; counter++)  {...}    infers int */