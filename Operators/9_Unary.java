
class Unary {
        
        public static void main(String[] args) {
                
                int x = 5, y = 9;
                
                int ans = ++x + y++ + x++;

		System.out.println(x);
		System.out.println(y);
		
		System.out.println(ans);
	}
}

