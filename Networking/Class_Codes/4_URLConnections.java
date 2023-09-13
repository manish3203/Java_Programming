
import java.io.*;
import java.net.*;
import java.util.*;

class URLConnectionsDemo {

	public static void main(String[] args)throws MalformedURLException, IOException {

		URL obj = new URL("https://www.youtube.com");

		URLConnection conn = obj.openConnection();

		System.out.println("Last Modified "+new Date(conn.getLastModified()));
	}
}

/*

   Last Modified Thu Jan 01 05:30:00 IST 1970
*/
