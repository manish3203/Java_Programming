/* 
  Program 4 : write a program to print the following pattern

	1A 2B 3C
	1A 2B 3C
	1A 2B 3C

  USE THIS FOR LOOP STRICTLY
  for(int i =1;i<=3;i++){
   for(j=1;j<=3;j++){
  }
}
*/

class Pattern {

        public static void main(String[] args) {

                for(int i = 1; i<=3; i++){
			char ch = 'A';
                        for(int j = 1; j<=3; j++){

                                System.out.print(j+""+ch+" ");
				ch++;
                        }
                        System.out.println();
                }
        }
}
