/* Program 6: write a program to find a maximum between three numbers
inputs1 :
num1 = 1
num2 = 2
num3 = 3
Output: 3 is the maximum between 1, 2 and 3
inputs2 :
num1 = 1
num2 = 4
num3 = 3
Output: 4 is the maximum between 1, 4 and 3

inputs3 :
num1 = 42
num2 = 32
num3 = 42
Output: ?????

*/

class MaxNum{

        public static void main(String[] args){

                int num1 = 5;
                int num2 = 5;
                int num3 = 2;

                if(num1 > num2 && num1 > num3){
			System.out.println(num1 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                
		}else if(num2 > num3 && num2 > num1){
                        System.out.println(num2 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                
		}else if(num3 > num2 && num3 > num1){
                        System.out.println(num3 +" is the maximum between " + num1 +","+num2 + " and "+num3);
		
		}else if(num1 == num2 && num3 > num1){
                        System.out.println(num3 +" is the maximum between " + num1 +","+num2 + " and "+num3);
		
		}else if(num2 == num3 && num1 > num2){
                        System.out.println(num1 +" is the maximum between " + num1 +","+num2 + " and "+num3);
		
		}else if(num1 == num3 && num2 > num1){
                        System.out.println(num2 +" is the maximum between " + num1 +","+num2 + " and "+num3);
		
		}else if(num1 == num2 && num1 > num3){
                        System.out.println(num1 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                
		}else if(num2 == num3 && num2 > num1){
                        System.out.println(num2 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                
		}else if(num1 == num3 && num3 > num2){
                        System.out.println(num3 +" is the maximum between " + num1 +","+num2 + " and "+num3);
                }else{

                        System.out.println("All Numbers Are Equal");
		}

	}
}
