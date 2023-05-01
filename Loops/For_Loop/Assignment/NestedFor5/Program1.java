/*write a program to print the following pattern
	D4 C3 B2 A1
	A1 B2 C3 D4
	D4 C3 B2 A1
	A1 B2 C3 D4

USE THIS FOR LOOP STRICTLY for the outer loop
Int row;
Take the number of rows from user
for(int i =1;i<=row;i++){
}
*/

import java.io.*;

class Pattern {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Number of rows");
		int row = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number of coloumn");
		int col = Integer.parseInt(br.readLine());

		for(int i=1; i<=row; i++){
			int num = row;
			char ch1 = (char)('A'+num-1);
			char ch2 = 'A';
			for(int j=1; j<=col; j++){

				if(i%2 == 1){
					System.out.print(ch1+""+num +" ");
					ch1--;
					num--;
				}else{
					System.out.print(ch2+""+j +" ");
					ch2++;
				}
			}
			System.out.println();
		}

	}
}
