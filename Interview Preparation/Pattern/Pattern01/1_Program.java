/*
 	Program 1 :

	Take no of rows from the user

	ROWS = 3
		
 	* * *
	* * *
	* * *
*/

import java.io.*;

class Pattern01 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number Of Rows :");
		int row = Integer.parseInt(br.readLine());
		int col = row;
		
		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=col; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
