
import java.io.*;

class CompareDemo {

	static int MyCompareTo(String str1, String str2){
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		int sub = 0;
		
		int count1 = 0;
		for(int i=0; i<arr1.length; i++){
			count1++;
		}
		
		int count2 = 0;
		for(int i=0; i<arr2.length; i++){
			count2++;
		}

		if(count1 > count2 || count1 < count2){

			sub = count1 - count2;
		}else{
			if(count1 >= count2){
				for(int i=0; i<count1; i++){

					if(arr1[i]!=arr2[i]){

						sub = arr1[i]-arr2[i];
					}
				}
			}else{
				for(int i=0; i<count2; i++){

					if(arr1[i]!=arr2[i]){

						sub = arr1[i]-arr2[i];
					}
				}
			}
		}
		return sub;

	}	

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter String 1 : ");
		String str1 = br.readLine();
		
		System.out.println("Enter String 2 : ");
		String str2 = br.readLine();

		System.out.println(MyCompareTo(str1,str2));

	}
}
