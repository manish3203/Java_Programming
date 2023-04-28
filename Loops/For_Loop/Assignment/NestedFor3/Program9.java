/* write a program to print the following pattern

   	1
	8 27
	64 125 216

USE THIS FOR LOOP STRICTLY for the outer loop
int row =3;
for(int i =1;i<=row;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		int row = 3;
		int num = 1;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				
				System.out.print(num*num*num+ " ");
				num++;
			}
			System.out.println();
		}
	}
}
