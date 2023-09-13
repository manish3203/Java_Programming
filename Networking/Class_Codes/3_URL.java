
import java.awt.*;
import java.net.*;
import java.io.*;

class OpenWebsite {

	public static void main(String[] args)throws URISyntaxException,IOException {

		String url = "https://www.youtube.com";

		URI obj = new URI(url);

		Desktop desk = Desktop.getDesktop();

		desk.browse(obj);
	}
}
