//Count of all even element in array

import java.io.*;

class EvenCount {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int count = 0;

		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] % 2 == 0){

				count++;
			}
		}
		System.out.println("Even Element Of Count is : "+count);
	}
}
		
