/* Write a program to take a number as input and print the Addition of Factorials of each
digit from that number.

Input: 1234
Output: Addition of factorials of each digit from 1234 = 33
*/

import java.io.*;

class Addfact {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Number : ");
		int num = Integer.parseInt(br.readLine());
		
		int temp = num;
		int rem;
		int sum = 0;

		while(temp != 0){

			rem = temp%10;
			int fact = 1;

			for(int i=rem; i>=1; i--){
				fact = fact*i;
			}
			sum = sum + fact;
			temp = temp/10;
		}
		System.out.println("Addition of factorials of each digit from "+num +" = "+sum);
	}
}
