//NumberFormat Exception

import java.io.*;

class ExceptionDemo {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);

		int data = Integer.parseInt(br.readLine());
		System.out.println(data);
	}
}

/*
manish  //Input
manish  //Output
chavan  //Input
Exception in thread "main" java.lang.NumberFormatException: For input string: "chavan"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:786)
	at ExceptionDemo.main(5_Numberformat.java:14)
*/
