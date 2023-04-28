/* write a program to print the following pattern

   	1
	3 4
	6 7 8
	10 11 12 13
	15 16 17 18 19

USE THIS FOR LOOP STRICTLY for the outer loop
Int row=5;
for(int i =1;i<=row;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		int num = 1;
		int row = 5;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				
				System.out.print(num+ " ");
				num++;
			}
			num++;
			System.out.println();
		}
	}
}
