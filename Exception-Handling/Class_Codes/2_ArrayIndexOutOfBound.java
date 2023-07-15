//ArrayIndexOutOfBound Exception

class ArrayDemo {

	public static void main(String[] args) {

		int arr[] = new int[] {10,20,30,40};

		for(int i=0; i<=arr.length; i++) {

			System.out.println(arr[i]);
		}
	}
}

/* 
10
20
30
40
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at ArrayDemo.main(2_ArrayIndexOutOfBound.java:11)
*/
