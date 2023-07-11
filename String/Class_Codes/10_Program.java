
import java.io.*;

class CompareDemo {	

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String 1 : ");
		String str1 = br.readLine();
		
		System.out.println("Enter String 2 : ");
		String str2 = br.readLine();

		System.out.println(str1.compareTo(str2));

	}
}
