package Collections;

public class Student {
	int roll;
	String name;
	Double marks;
Student(int roll,String name,String marks)
{
	this.roll=roll;
	this.name=name;
	this.marks=Double.parseDouble(marks);
}
public String toString()
{
	return roll+","+name+","+marks;
}
}
