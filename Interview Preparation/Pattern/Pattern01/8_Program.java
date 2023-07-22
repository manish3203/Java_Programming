/*
 	Program 8 :

	Take no of rows from the user
	ROWS = 3

	1 3 5
	7 9 11
	13 15 17

*/

import java.io.*;

class Pattern08 {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number Of Rows :");
                int row = Integer.parseInt(br.readLine());
                int col = row;
		
		int num = 1;

                for(int i=1; i<=row; i++) {

                        for(int j=1; j<=col; j++) {

                                System.out.print(num+" ");
				num+=2;
                        }
                        System.out.println();
                }
        }
}

