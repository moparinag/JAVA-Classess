class ForLoopnum8
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter n value");
int n=scn.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
		if(j<=i)
		{
			System.out.print(j);
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