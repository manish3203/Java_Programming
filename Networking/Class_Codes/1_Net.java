
import java.net.*;
import java.io.*;

class IPAdress {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Site : ");
		String site = br.readLine();

		InetAddress ip = InetAddress.getByName(site);

		System.out.println("IP Address : "+ip);

	}
}	
