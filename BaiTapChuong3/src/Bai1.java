import java.net.URL;

public class Bai1 {
	public static URL url;

	public Bai1(URL url) {
		this.url = url;
	}

	public static void getInfo() {
		// tên file, tên host, số hiệu cổng, kiểu giao thức
		System.out.println("URL is " + url);
		System.out.println("The protocol part is " + url.getProtocol());
		System.out.println("The host part is " + url.getHost());
		System.out.println("The file part is " + url.getFile());
		System.out.println("The reference part is " + url.getRef());
	}

}
