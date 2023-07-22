/*
 	Program 7 :

	Take no of rows from the user
	ROWS = 3

	A A A
	B B B
	C C C
*/

import java.io.*;

class Pattern07 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number Of Rows :");
		int row = Integer.parseInt(br.readLine());
		int col = row;

		char ch = 'A';

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=col; j++) {

				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}
