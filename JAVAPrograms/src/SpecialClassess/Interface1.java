package SpecialClassess;

public interface Interface1 {
 void m1();
 default void m2()
 {
	System.out.println("Complete Method in Interface"); 
 }
 
}
