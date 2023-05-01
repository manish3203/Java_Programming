/* write a program to print the following pattern
	
   	Row = 8
	$
	@ @
	& & &
	# # # #
	$ $ $ $ $
	@ @ @ @ @ @
	& & & & & & &
	# # # # # # # #
USE THIS FOR LOOP STRICTLY for the outer loop
Int row;

Take row from user
for(int i =1;i<=row;i++){
}
*/

import java.io.*;

class Pattern {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of rows : ");
		int row = Integer.parseInt(br.readLine());

		int num = 1;

		for(int i=1;i<=row;i++){

			if(num==5){

				num = 1;
			}
			for(int j=1;j<=i;j++){

				if(num==1){

					System.out.print("$ ");
				}
				if(num==2){

					System.out.print("@ ");
				}
				if(num==3){

					System.out.print("& ");
				}
				if(num==4){

					System.out.print("# ");
				}


			}
			num++;
			System.out.println();
		}
	}
}

