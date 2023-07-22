/*
 	Program 10 :

	Take no of rows from the user 
	ROWS = 3

	1 4 7
	10 13 16
	19 22 25

*/


import java.io.*;

class Pattern10 {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number Of Rows :");
                int row = Integer.parseInt(br.readLine());
                int col = row;

                int num = 1;

                for(int i=1; i<=row; i++) {

                        for(int j=1; j<=col; j++) {

                                System.out.print(num+" ");
                                num+=3;
                        }
                        System.out.println();
                }
        }
}
