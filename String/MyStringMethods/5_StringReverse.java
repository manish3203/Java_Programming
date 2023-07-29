
import java.io.*;

class ReverseString {

	static String MyStringReverse(String str){
		
		char arr[] = str.toCharArray();

		int start = 0;
		int end = arr.length-1;

		while(start < end){

			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		str = new String(arr);
		return str;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String : ");
		String str = br.readLine();

		String rev = MyStringReverse(str);
		
		System.out.println("Reverse String is : ");
		System.out.println(rev);
	}
}	
