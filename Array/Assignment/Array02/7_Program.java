/* 
  Program 7 : WAP to find the common elements between two arrays.

		Input :
		Enter first array : 1 2 3 5
		Enter Second array: 2 1 9 8
		Output: Common elements :
		1
		2
*/

import java.io.*;

class CommonElement {

        public static void main(String[] agrs)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter size of an array");
                int size = Integer.parseInt(br.readLine());

                int arr1[] = new int[size];
		int arr2[] = new int[size];

                System.out.println("Enter array 1 elements");
                for(int i=0; i<arr1.length; i++) {

                        arr1[i] = Integer.parseInt(br.readLine());
                }
                
		System.out.println("Enter array 2 elements");
                for(int i=0; i<arr2.length; i++) {

                        arr2[i] = Integer.parseInt(br.readLine());
                }
                
		System.out.println("common elements : ");
                for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){

	                        if( arr1[i] == arr2[j]){
					System.out.println(arr1[i]);
				}
                	        
			}
		}
	}
}

