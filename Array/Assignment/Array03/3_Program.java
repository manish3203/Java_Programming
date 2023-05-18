/*
  Program 3 : WAP to find a composite number from an array and return its index.
	      Take size and elements from the user

		Input: 1 2 3 5 6 7
		Output: composite 6 found at index: 4
*/

import java.io.*;

class Composite {

	static int CompositeNo(int arr1[],int arr2[]){
		
		int itr = -1;

		for(int i=0; i<arr1.length; i++){

			int count = 0;

			for(int j=1; j<=arr1[i]; j++){

				if(arr1[i] % j == 0){

					count++;
				}

			}
			if(count>2){
				
				itr++;
				arr2[itr] = i;
			
			}
		}
		return itr;
	}

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];

		System.out.println("Enter array elements");
		for(int i=0; i<arr1.length; i++){

			arr1[i] = Integer.parseInt(br.readLine());
		}

		int arr2[] = new int[arr1.length];
		
		int ret = CompositeNo(arr1,arr2);
		if(0 <= ret){

			for(int i=0; i<=ret; i++){

				System.out.println("Composite No "+arr1[arr2[i]]+" found at index "+arr2[i]);
			}
		}else{
			System.out.println("Composite Number is not found in an array");
		}
	}
}
