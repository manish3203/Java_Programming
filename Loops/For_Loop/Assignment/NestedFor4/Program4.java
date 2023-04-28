/* write a program to print the following pattern

   	1 2 3 4
	2 3 4
	3 4
	4

int row=4;
for(int i =1;i<=row;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		int row = 4;

		for(int i=1; i<=row; i++){
			int num = i;
			for(int j=row; j>=i; j--){

				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
