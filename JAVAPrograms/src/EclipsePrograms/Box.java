package EclipsePrograms;

public class Box {
int lenght;
int breadth;
int height;
 Box()
{
	
}
 Box(int l,int b,int h)
 {
	lenght=l;
	breadth=b;
	height=h;
	
 }
 Box(int l)
 {
	 lenght=breadth=height=l;
 }
 public String Display()
 {
	return "lenght="+lenght+", breadth="+breadth+", Height="+height;
 }
	
}
