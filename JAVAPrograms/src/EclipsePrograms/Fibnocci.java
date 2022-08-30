package EclipsePrograms;

class Fibnocci
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter 1st value");
int n=scn.nextInt();
System.out.println("Enter 2nd Value");
int m=scn.nextInt();
System.out.println("Enter Series");
int s=scn.nextInt();
System.out.print(n+" ");
System.out.print(m+" ");
for(int i=1;i<=s;i++)
{
int c=n+m;
System.out.print(c+" ");
n=m;
m=c;
}
}
}

