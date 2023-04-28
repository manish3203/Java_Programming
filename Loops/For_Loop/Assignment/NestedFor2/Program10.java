/* 
  Program 10 : write a program to print the following pattern

	F 5 D 3 B 1
	F 5 D 3 B 1
	F 5 D 3 B 1
	F 5 D 3 B 1
	F 5 D 3 B 1
	F 5 D 3 B 1

  USE THIS FOR LOOP STRICTLY

  for(int i =1;i<=6;i++){
   for(j=1;j<=6;j++){
 }
}
*/


class Pattern {
	
	public static void main(String[] args){

		int row = 6,col = 6;

		for(int i = 1; i<=row; i++){
			char ch = 'F';
			int num = 6;
			for(int j = 1; j<=col; j++){

				if(j%2 == 1){
					System.out.print(ch+ " ");
				}else{
					System.out.print(num+ " ");
				}
				ch--;
				num--;
			}
			System.out.println();
		}
			
	}
}
