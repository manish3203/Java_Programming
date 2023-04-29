//Count of all even and odd element in array

import java.io.*;

class EvenCount {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int Evencount = 0;
		int Oddcount = 0;

		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] % 2 == 0){

				Evencount++;
			}else{
				Oddcount++;
			}
		}
		System.out.println("Even Element Of Count is : "+Evencount);
		System.out.println("Odd Element Of Count is : "+Oddcount);
	}
}
		
