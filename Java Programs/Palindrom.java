class Palindrom
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter n Value");
int n=scn.nextInt();
int p=n;
int q=0;
while(n>0)
{
int r=n%10;
q=q*10+r;
n=n/10;
}
if(p==q)
{
System.out.println("Num is Palidrom");
}
else
{
System.out.println("Num is Not Palindrom");
}
}
}
