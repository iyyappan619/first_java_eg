package interfaceexample;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

interface inter1
{
	int i=10;	
}


class ABC implements inter1
{
	public ABC() {
		System.out.println(i);
	}
}

public class MainClass
{
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:/Users/Iyyappan/Desktop/text.txt");
		FileOutputStream fo = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fo);
		fo.write(1);
		dos.writeInt(12);
	}
}