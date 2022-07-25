package ArrayPrograms;

public class Book {
String Name;
double price;
String Author;
Book(String Name,double price,String Author)
{
	this.Name=Name;
	this.price=price;
	this.Author=Author;
	
}
public void Display()
{
	System.out.println("Name="+Name+" Price="+price+" Author="+Author);
}
}
