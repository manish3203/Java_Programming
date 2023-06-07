class Core2Web {

	public static void main(String[] args) {
		
		int [] var1 = new int[5];
		var1[2] = 1;
		var1[3] = 2;
		var1[4] = 3;

		for(int var2 = 0; var2 < var1.length; var2++)
			System.out.println(var1[var2]);
	}
}
