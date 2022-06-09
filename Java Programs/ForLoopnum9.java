class ForLoopnum9
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter n value");
int n=scn.nextInt();
int a=1;
for(int i=1;i<=n;i++)
{

	for(int j=1;j<=i;j++)
	{
	System.out.print(" "+a++);
	}
	System.out.println();
	}
	}
	}
	