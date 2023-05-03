//HashCode

class HashCodeDemo {

        public static void main(String[] args){

                String str1 = "Shashi";
                String str2 = new String("Shashi");
                String str3 = "Shashi";
                String str4 = new String("Shashi");

                System.out.println(str1.hashCode());
                System.out.println(str2.hashCode());
                System.out.println(str3.hashCode());
                System.out.println(str4.hashCode());
        }
}
/*
-1819698008
-1819698008
-1819698008
-1819698008
*/
