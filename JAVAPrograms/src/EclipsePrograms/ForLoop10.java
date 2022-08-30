package EclipsePrograms;

class ForLoop10
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter n Value");
int n=scn.nextInt();
System.out.println("Enter a Value");
int a=scn.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=a;j++)
	{
		System.out.print("*");
	}
	a--;
	System.out.println();
}
}
}