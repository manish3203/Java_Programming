
import java.io.*;

class Input {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println(str);

		br.close();

		String str2 = br.readLine();
		System.out.println(str2);
	}
}

/*
manish
manish
Exception in thread "main" java.io.IOException: Stream closed
	at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:123)
	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:321)
	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
	at Input.main(8_Exception.java:15)
*/
