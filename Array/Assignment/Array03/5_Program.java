/*
  Program 5 : WAP to find a Perfect number from an array and return its index.
	      Take size and elements from the user

		Input: 10 25 252 496 564
		Output: Perfect no 496 found at index: 3
*/

import java.io.*;

class PerfectNo {

	static int PerfectNumber(int arr1[],int arr2[]){


		for(int i=0; i<arr.length; i++){

			int sum = 0;

			for(int j=1; j<arr1[i]; j++){
				
				if(num % j == 0){

					sum = sum + num;
				}
				index++;
			}
			if(arr[i] == sum){
				
				System.out.println("Perfectn no "+arr[i]+" found at index ");
			}
		}
		return index;
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
		
		PerfectNumber(arr,index);

	}
}
