import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Bai2 {
	public URL url;
	public URLConnection uc;

	public Bai2(URL url) {
		this.url = url;
	}

	public void content() {
		Object theHtml;
		String thisLine;
		try {
			uc = url.openConnection();
			theHtml = uc.getContent();
			System.out.println(theHtml.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
