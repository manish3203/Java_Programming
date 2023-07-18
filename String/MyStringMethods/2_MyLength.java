
import java.io.*;

class StringLength {
	
	static int MyStringLength(String str){
		
		char sarr[] = str.toCharArray();

		int count = 0;

		for(int i=0; i<sarr.length; i++){

			count++;
		}
		return count;
	}
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String : ");
		String str = br.readLine();

		int len = MyStringLength(str);

		System.out.println("String Length is : ");

		System.out.println(len);
	}
}
