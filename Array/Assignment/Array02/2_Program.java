/*
  Program 2 : WAP to find the number of even and odd integers in a given array of integers

		Input: 1 2 5 4 6 7 8
		Output:
		Number of Even Elements: 4
		Number of Odd Elements : 3
*/

import java.io.*;

class EvenOdd {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		int oddCount = 0,evenCount = 0;

		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] % 2 == 0){

				evenCount++;
			}else{

				oddCount++;
			}
		}
		System.out.println("Number of Even Elements Count : "+evenCount);
		System.out.println("Number of Odd Elements Count : "+oddCount);

	}
}
