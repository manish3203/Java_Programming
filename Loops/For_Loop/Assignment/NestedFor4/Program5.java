/* write a program to print the following pattern

   	A B C D
	B C D
	C D
	D

int row=4;
for(int i =1;i<=row;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		char ch1 = 'A';
		int row = 4;

		for(int i=1; i<=row; i++){
			char ch2 = ch1;
			for(int j=row; j>=i; j--){

				System.out.print(ch2+ " ");
				ch2++;
			}
			ch1++;
			System.out.println();
		}
	}
}
