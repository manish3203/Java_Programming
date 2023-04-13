
class Relational {

	public static void main(String[] args){

		int x = 10;
		int y = 20;

		if(x){                             //error: incompatible types: int cannot be converted to boolean

			System.out.println("Hello");
		}else{
			System.out.println("Hiii");
		}
	}
}
