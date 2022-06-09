class Factorial
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter n value");
int n=scn.nextInt();
int a=1;
for(int i=1;i<=n;i++)
{
a=a*i;
	}
	System.out.println("factorial of "+n+"="+a);
	}
	}
	