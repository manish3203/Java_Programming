/*

	Program 2 :

	Take no of rows from the user 
	ROWS = 4

	d d d d
	c c c c
	b b b b
	a a a a

*/

import java.io.*;

class Pattern02 {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number Of Rows : ");
		int row = Integer.parseInt(br.readLine());
		int col = row;

		char ch = (char)(97+row-1);

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=col; j++) {

				System.out.print(ch+" ");
			}
			ch--;
			System.out.println();
		}
	}
}
