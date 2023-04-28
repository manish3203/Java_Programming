/* write a program to print the following pattern

   	1
	8 9
	9 64 25
	64 25 216 49

USE THIS FOR LOOP STRICTLY for the outer loop
Int row=4;
for(int i =1;i<=row;i++){
}
*/

class Pattern {

	public static void main(String[] args){

		int row = 4;

		for(int i=1; i<=row; i++){
			int num = i;
			for(int j=1; j<=i; j++){

				if(num%2 == 0){
					System.out.print(num*num*num+ " ");
					num++;
				}else{
					System.out.print(num*num+ " ");
					num++;
				}
			}
			System.out.println();
		}
	}
}



