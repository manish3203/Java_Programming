/* write a program to print a series of prime numbers from entered range. ( Take a start and end number
from a user )
Perform dry run at least from 10 to 20 ...
	
	Input:-
	Enter starting number: 10
	Enter ending number: 100

	Output:-
	Series = 11 13 17 19 ..... 89 97
*/

import java.io.*;

class PrimeNo {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Starting Number : ");
		int start = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Ending  Number : ");
		int end = Integer.parseInt(br.readLine());
		
		System.out.print("Prime Number Series = ");
		for(int i=start; i<=end; i++){
			int count = 0;
			for(int j=1; j<=i; j++){
				if(i%1 == 0 && i%j == 0){
					count++;
				}
			}
			if(count == 2){
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}
}

