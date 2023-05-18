/*
  Program 2 : WAP to reverse each element in an array.
	      Take size and elements from the user

		Input: 10 25 252 36 564
		Output: 01 52 252 63 465
*/

import java.io.*;

class Reverse {

	static void ReverseElement(int arr[]){
		
		for(int i=0; i<arr.length; i++){

			int num = arr[i];
			int rev = 0;

			while(num != 0){

				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num/10;
			}
			System.out.println(rev);
		}

	}

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Reverse Elements In An Array : ");
		
		ReverseElement(arr);

	}
}
