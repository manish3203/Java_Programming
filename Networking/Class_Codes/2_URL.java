import java.net.*;

class URLDemo {
        
        public static void main(String[] args)throws MalformedURLException {
                
                URL obj = new URL("https://www.core2web.in");
                
                System.out.println(obj.getProtocol());
                System.out.println(obj.getPort());
                System.out.println(obj.getFile());
        }       
}        
