/* write a program to print the following pattern

   	9
	9 8
	9 8 7
	9 8 7 6

USE THIS FOR LOOP STRICTLY for the outer loop
for(int i =1;i<=4;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		int row = 4;
		
		for(int i=1; i<=row; i++){
			int num = 9;
			for(int j=1; j<=i; j++){

				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
}
