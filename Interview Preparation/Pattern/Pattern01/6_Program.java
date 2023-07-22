/*
 	Program 6 :

	Take no of rows from the user
	ROWS = 3

	9 8 7
	6 5 4
	3 2 1

*/

import java.io.*;

class Pattern06 {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number Of Rows :");
                int row = Integer.parseInt(br.readLine());
                int col = row;

		int num = row*col;

                for(int i=1; i<=row; i++) {

                        for(int j=1; j<=col; j++) {

                                System.out.print(num+" ");
				num--;
                        }
                        System.out.println();
                }
        }
}
