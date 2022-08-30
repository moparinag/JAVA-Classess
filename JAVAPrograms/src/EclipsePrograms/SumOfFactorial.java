package EclipsePrograms;

class SumOfFactorial
{
	//Strong Number
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter n Value");
int n=scn.nextInt();
if(n==SumOfFactorial(n))
{
System.out.println(SumOfFactorial(n)+"is Strong Number");
}
else
{
	System.out.println("Not Strong Number");
}
}
public static int factorial(int a)
{
int fac=1;
for(int i=1;i<=a;i++)
{
fac=fac*i;
}
return fac;
}
public static int SumOfFactorial(int a)
{
int sum=0;
while(a>0)
{
int r=a%10;
sum=sum+factorial(r);
a=a/10;
}
return sum;
}
}