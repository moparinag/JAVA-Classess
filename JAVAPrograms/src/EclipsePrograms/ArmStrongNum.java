package EclipsePrograms;

class ArmStrongNum
{
public static void main(String[] args)
{
	//sum of cube of each digit is equal to same number
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter n Value");
int n=scn.nextInt();
int p=n;
int sum=0;
while(n>0)
{
	int r=n%10;
	sum=sum+r*r*r;
	n=n/10;
}
if(p==sum)
{
	System.out.println("ArmStrong Number");
}
else
{
	System.out.println("Not ArmStrong Number");
}
}
}