/* 
   Program 3 : Count digit in number

   Input: 942111423
   Output: count of digits = 9
*/

class countDigit{

	public static void main(String[] args){
		
		int num = 293847781;
		int count = 0;
		while(num != 0){
			
			count++;
			num = num / 10;
		}
		System.out.println("Count is " + count);

	}
}
