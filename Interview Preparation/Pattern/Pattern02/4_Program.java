/*

	Problem 4 :

	Take no of rows from the user 
	ROWS = 4

	D D D D
	C C C C
	B B B B
	A A A A

*/

import java.io.*;

class Pattern04 {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number Of Rows : ");
                int row = Integer.parseInt(br.readLine());
                int col = row;

                char ch = (char)(65+row-1);

                for(int i=1; i<=row; i++) {

                        for(int j=1; j<=col; j++) {

                                System.out.print(ch+" ");
                        }
                        ch--;
                        System.out.println();
                }
        }
}

