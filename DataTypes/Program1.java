class Demo {
	
	public static void main(string[] args){

		byte var1 = 18;
		byte var2 = 18;

		System.out.println(var1);
		System.out.println(var2);

		var1 = var1+var2;
		
		System.out.println(var1);
		System.out.println(var2);
	}
}


/* Error : incompatible data types: possible lossy conversion from int to byte */
