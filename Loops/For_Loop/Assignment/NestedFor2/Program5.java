/* 
  Program 5 : write a program to print the following pattern

	26 Z 25 Y
	24 X 23 W
	22 V 21 U
	20 T 19 S
	
  USE THIS FOR LOOP STRICTLY
  for(int i =1;i<=4;i++){
   for(j=1;j<=4;j++){
  }
}
Hint you can take two variables
*/

class Pattern {
	
	public static void main(String[] args){
		
		char ch = 'Z';
		int num = 26;
		int row = 4,col = 4;

		for(int i = 1; i<=row; i++){
			for(int j = 1; j<=col; j++){
				
				if(j%2 == 1){
					System.out.print(num+ " ");
					num--;
				}else{
					System.out.print(ch+ " ");
					ch--;
				}
			}
			System.out.println();
		}
	}
}
