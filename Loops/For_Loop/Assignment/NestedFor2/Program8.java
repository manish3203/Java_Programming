/* 
  Program 8 : write a program to print the following pattern

	A b C d
	E f G h
	I j K l
	M n O p

  USE THIS FOR LOOP STRICTLY
  for(int i =1;i<=4;i++){
   for(j=1;j<=4;j++){
 }
}
Hint you can take two variables
*/

class Pattern {

        public static void main(String[] args) {

                char ch = 'A';
		char ch1 = 'a';

                for(int i = 1; i<=4; i++){
                        for(int j = 1; j<=4; j++){

                                if(j%2 == 1){
					System.out.print(ch+" ");
				}else{
					System.out.print(ch1+" ");
				}
				ch++;
				ch1++;
                        }
                        System.out.println();
                }
        }
}
