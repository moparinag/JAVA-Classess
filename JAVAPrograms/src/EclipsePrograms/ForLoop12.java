package EclipsePrograms;

class ForLoop12
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
	for(int j=n;j>i;j--)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=a;k++)
	{
		System.out.print("*");
	}
	a=a+2;
	System.out.println();
}
}
}