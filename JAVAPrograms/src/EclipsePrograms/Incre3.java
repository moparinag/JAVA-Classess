package EclipsePrograms;

class Incre3
{
public static void main(String[] args)
{
int a=1;
int b=1;
int c=1;
a=++a + b++ + ++c;
b=a++ + ++b + c++;
c=++a + ++b + c++;
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
}
}