package ExceptionPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Fileread extends Exception{
	String s;
	Fileread(String s)
	{
		this.s=s;
			}
	@Override
	public String getMessage() {
		
		return s;
	}

	public static void main(String[] args) {
		try {
			Readfile1.Readdata();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
