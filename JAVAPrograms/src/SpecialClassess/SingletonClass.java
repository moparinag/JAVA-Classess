package SpecialClassess;

public class SingletonClass {
static SingletonClass single_object=null;
private SingletonClass() {
	
}
public static SingletonClass get_object()
{
	if(single_object==null)
	{
		single_object =new SingletonClass();
	}
	return single_object;
	
}
}
