
import java.io.*;

class StringLengthCompare {

	static void MyCompareStringLength(String str1, String str2){

		char sarr1[] = str1.toCharArray();
		char sarr2[] = str2.toCharArray();

		int countStr1 = 0, countStr2 = 0;
		
		//count string 1 length
		for(int i=0; i<sarr1.length; i++){

			countStr1++;
		}

		//count string 2 length
		for(int i=0; i<sarr2.length; i++){

			countStr2++;
		}

		if(countStr1 == countStr2){

			System.out.println("Length Equal");
		}else{
			System.out.println("Length Not Equal");
		}
	}

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String 1 : ");
		String str1 = br.readLine();
		
		System.out.println("Enter String 2 : ");
		String str2 = br.readLine();

		MyCompareStringLength(str1,str2);
	}
}
