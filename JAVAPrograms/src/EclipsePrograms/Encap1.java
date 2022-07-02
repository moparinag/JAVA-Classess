package EclipsePrograms;

public class Encap1 {
private String name;
private int phoneno;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static void main(String[] args)
{
	Encap1 e=new Encap1();
	e.setName("Mona");
	System.out.println(e.getName());
	e.setPhoneno(903785469);
	System.out.println(e.getPhoneno());
}
public int getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}
}
