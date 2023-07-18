
import java.io.*;

class CompareIgnore {

	static int MyLength(String str){

		char arr[] = str.toCharArray();

		int count = 0;

		for(int x : arr){

			count++;
		}
		return count;
	}

	static int MyCompareToIgnore(String str1, String str2){
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		int len1 = MyLength(str1);
		int len2 = MyLength(str2);

		if(len1 == len2){

			for(int i=0; i<arr1.length; i++){

				if(arr1[i] == arr2[i] || (arr1[i]-arr2[i] == -32) || (arr1[i]-arr2[i] == 32)){
					
					continue;

				}else{
					return arr1[i]-arr2[i];
				}
			}
		}else{
			return len1-len2;
		}
		return 0;
	}

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String 1 : ");
		String str1 = br.readLine();
		
		System.out.println("Enter String 2 : ");
		String str2 = br.readLine();

		int ret = MyCompareToIgnore(str1,str2);

		System.out.println(ret);
		
	}
}
