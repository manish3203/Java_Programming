/* write a program to print the following pattern
	
   	Row =5;
	O
	14 13
	L  K J
	9  8 7 6
	E  D C B A

	Row = 4
	10
	I H
	7 6 5
	D C B A

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
		
		int num = row*(row+1)/2;
		char ch = (char)('A'+num-1);
		
		if(row%2 == 1){
			for(int i=1; i<=row; i++){
				for(int j=1; j<=i; j++){
				
					if(i%2 == 1){
						System.out.print(ch+ " ");
					}else{
						System.out.print(num+ " ");
					}
					num--;
					ch--;
				}	
				System.out.println();
			}
		}else{
			 for(int i=1; i<=row; i++){
                                for(int j=1; j<=i; j++){

                                        if(i%2 == 0){
                                                System.out.print(ch+ " ");
                                        }else{
                                                System.out.print(num+ " ");
                                        }
                                        num--;
                                        ch--;
                                }
                                System.out.println();
                        }
		}
	}
}

