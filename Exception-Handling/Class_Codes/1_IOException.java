//IOException

import java.io.*;

class Demo {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
	}
}

/* error: unreported exception IOException; must be caught or declared to be thrown
		String str = br.readLine();
*/
