/*
 	Program 2 :

	Take no of rows & cols from the user
	ROWS = 3
	Col = 4

	1 2 3 4
	5 6 7 8
	9 10 11 12

*/

import java.io.*;

class Pattern02 {
	
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number Of Rows :");
		int row = Integer.parseInt(br.readLine());

		System.out.println("Enter Number Of Coloumn :");
		int col = Integer.parseInt(br.readLine());
		
		int num = 1;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=col; j++) {

				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
}
