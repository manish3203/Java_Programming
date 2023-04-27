/* 
  Program 4 : Write a program, take 7 characters as an input , Print only vowels from the array

		Input: a b c o d p e
		Output : a o e
*/

import java.io.*;

class Vowels {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of an array");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];
		
		System.out.println("Enter array elements ");
		for(int i=0; i<arr.length; i++){

			arr[i] = br.readLine().charAt(0);

		}

		System.out.println("Vowels in array  ");
		for(int i=0; i<arr.length; i++){

			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){

			System.out.println(arr[i]);
			}
		}
	}
}	
