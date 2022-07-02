package EclipsePrograms;

public class Student1 {
String name;
int Phoneno;
Address adr;
public Student1(String name,int Phoneno,Address adr)
{
	this.name=name;
	this.Phoneno=Phoneno;
	this.adr=adr;
}
public void Displayinfo()
{
	System.out.println("Name="+name+",Phoneno="+Phoneno+",Address");
	adr.Display();
}
}
