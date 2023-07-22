/*
 	Program 5 :

	Take no of rows from the user
	ROWS = 4

	4 4 4 4
	3 3 3 3
	2 2 2 2
	1 1 1 1
*/

import java.io.*;

class Pattern05 {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number Of Rows :");
                int row = Integer.parseInt(br.readLine());
                int col = row;
		
		int num = row;
                for(int i=1; i<=row; i++) {

                        for(int j=1; j<=col; j++) {

                                System.out.print(num+" ");
                        }
			num--;
                        System.out.println();
                }
        }
}
