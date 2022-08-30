package EclipsePrograms;

class Condition3
{
public static void main(String[] args)
{
	java.util.Scanner scn=new java.util.Scanner(System.in);
	System.out.println("Enter a Value=");
	int a=scn.nextInt();
	System.out.println("Enter b Value=");
	int b=scn.nextInt();
	if(a>b)
	{
		System.out.println("a is bigger than b");
	}
	else
	{
		System.out.println("b is bigger than a");
	}
}
}