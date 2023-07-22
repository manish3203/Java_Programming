/*
 	Program 3 :
	
	Take no of rows from the user
	ROWS = 3

	a b c
	d e f
	g h i
*/

import java.io.*;

class Pattern03 {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number Of Rows :");
                int row = Integer.parseInt(br.readLine());
                int col = row;
		
		char ch = 'a';

                for(int i=1; i<=row; i++) {

                        for(int j=1; j<=col; j++) {

                                System.out.print(ch+" ");
				ch++;
                        }
                        System.out.println();
                }
        }
}
