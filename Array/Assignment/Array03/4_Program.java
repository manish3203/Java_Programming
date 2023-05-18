/*
  Program 4 : WAP to find a prime number from an array and return its index.
	      Take size and elements from the user

		Input: 10 25 36 566 34 53 50 100
		Output: prime no 53 found at index: 5
*/

import java.io.*;

class PrimeNo {

	static int Prime(int arr1[],int arr2[]){

		int itr = 0;
		
		for(int i=0; i<arr1.length; i++){

			int count = 0;

			for(int j=1; j<=arr1[i]; j++){
				
				if(arr1[i] % j == 0){

					count++;
				}

			}
			if(count == 2){

				
				arr2[itr] = i;
				itr++;
			}
		}
		return itr;
			
	}
	

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];

		System.out.println("Enter element of an array");
		for(int i=0; i<arr1.length; i++){

			arr1[i] = Integer.parseInt(br.readLine());
		}

		int arr2[] = new int[arr1.length];

		int ret = Prime(arr1,arr2);

		if(ret>0){

			for(int i=0; i<ret; i++){
				System.out.println("Prime No "+arr1[arr2[i]]+" found at index "+arr2[i]);
			}
		}else{
			System.out.println("Prime Number not found in an array");
		}
	}
}
