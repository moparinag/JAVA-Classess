class ForLoopnum7
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("enter n value");
int n=scn.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		if((j==(n+1)/2)||(i==(n+1)/2))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
		
	}
	System.out.println();
}
}
}
