package SpecialClassess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\VEGI\\Documents\\FileType\\x.txt");
		if(!f.exists())
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("file already Exists");
		}
		String s="Java is 100% Object Oriented Programming Language";
		FileWriter fw=new FileWriter(f);
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write(s);
		bf.close();
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());
		br.close();
	}
	

}
