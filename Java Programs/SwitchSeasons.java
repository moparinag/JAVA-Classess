class SwitchSeasons
{
public static void main(String[] args)
{
	java.util.Scanner scn=new java.util.Scanner(System.in);
	System.out.println("Enter the days");
	int Months=scn.nextInt();
	switch(Months)
	{
		case 10:
		case 11:
		case 12:
		case 1:
		System.out.println("Winter");
		break;
		case 2:
		case 3:
		case 4:
		case 5:
		System.out.println("Summer");
		break;
		case 6:
		case 7:
		case 8:
		case 9:
		System.out.println("Rainy");
		break;
		default:
		System.out.println("Invalid Input");
}
}
}