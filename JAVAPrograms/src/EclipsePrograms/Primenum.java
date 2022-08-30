package EclipsePrograms;

class Primenum
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter n Value");
int n=scn.nextInt();
int a=1;
for(int i=2;i<n/2;i++)
{
	if(n%i==0)
	{
		a=0;
		System.out.println("the number "+n+"is not prime num");
		break;
	}
}
{
	if(a==1)
	{
		System.out.println("the number "+n+"is prime num");
	}
	}
}
}