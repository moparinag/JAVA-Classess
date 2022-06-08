class Dowhileloop1
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter age");
int age=scn.nextInt();
do
{
System.out.println("Executing.....");
age--;
}while(age>18);
}
}