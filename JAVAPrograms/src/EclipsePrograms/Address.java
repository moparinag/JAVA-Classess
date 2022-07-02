package EclipsePrograms;

public class Address {
String Country;
String State;
String city;
Address(String Country,String State,String city)
{
	this.Country=Country;
	this.State=State;
	this.city=city;
}
void Display()
{
	System.out.println("[Countrty="+Country+",State="+State+",City="+city+"]");
}
}
