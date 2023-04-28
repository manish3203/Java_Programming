/* write a program to print the following pattern

   	1 2 3 4
	4 5 6
	6 7
	7

USE THIS FOR LOOP STRICTLY
for(int i =1;i<=4;i++){

}
*/

class Pattern {

	public static void main(String[] args){

		int row = 4;
		int num = 1;

		for(int i=1; i<=row; i++){
			for(int j=row; j>=i; j--){

				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
}
