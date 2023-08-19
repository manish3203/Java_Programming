
import java.util.*;
import java.io.*;

class PropertiesDemo {

	public static void main(String[] args)throws IOException {

		Properties obj = new Properties();

		FileInputStream fobj = new FileInputStream("Friends.properties");

		obj.load(fobj);

		String name = obj.getProperty("Ganesh");
		System.out.println(name);  //Dassault System

		obj.setProperty("Manish","IBM");

		FileOutputStream outObj = new FileOutputStream("Friends.properties");
		obj.store(outObj,"Updated By Manish");
	}
}
