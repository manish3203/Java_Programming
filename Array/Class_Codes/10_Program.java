//Passing array as an argument

class ArrayPassing {

	void fun(int arr[]){

		for(int i : arr) {

			System.out.print(i + " ");
		}	
	}

	public static void main(String[] args){
		
		ArrayPassing obj = new ArrayPassing();

		int arr[] = {1,2,3,4,5,6};

		for(int i : arr) {

			System.out.print(i + " ");
		}
		System.out.println();
		obj.fun(arr);

		System.out.println();
	}
}
