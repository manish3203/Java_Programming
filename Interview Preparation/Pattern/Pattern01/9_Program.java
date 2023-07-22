/*
 	Program 9 :

	Take no of rows from the user
	ROWS = 4

	1 2 3 4
	a b c d
	5 6 7 8
	e f g h

*/

import java.io.*;

class Pattern09 {

        public static void main(String[] args)throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Number Of Rows :");
                int row = Integer.parseInt(br.readLine());
                int col = row;
		
		int num = 1;
		char ch = 'a';

                for(int i=1; i<=row; i++) {

                        for(int j=1; j<=col; j++) {

                                if(i%2==1) {

					System.out.print(num+" ");
					num++;
				}else{

					System.out.print(ch+ " ");
					ch++;
				}
                        }
                        System.out.println();
                }
        }
}

