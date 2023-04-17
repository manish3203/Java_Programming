/* Program 10: Write a unique real-time example of If ElseIf Else Ladder  */

class Grades{

        public static void main(String[] args){

                float Marks = 70f;


		if(Marks >= 0f && Marks <= 100f){

			if(Marks >= 75.00f && Marks <= 100.00f){
				System.out.println("A grade");
                	
			}else if(Marks >= 50.0f && Marks <= 74.00f){
                        	System.out.println("B Grade");
                	
			}else if(Marks >= 35.00f && Marks <= 49.00f){
				System.out.println("C Grade");
			
			}else{

				System.out.println("Fail");
			}
		}else{

			System.out.println("Invalid Marks");
		}
        }
}
