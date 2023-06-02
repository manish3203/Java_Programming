class Core2Web{
	
	static int var = 2;	
	public static void main(String[] args){

		var=(var=4)*(++var);
		System.out.println(var);
	}
}
